# BlogBackEnd
## Build and run the project
### Pull the code
You already done that!
### install the DB
1, install MySql follow the tutorial (https://dev.mysql.com/doc/mysql-installation-excerpt/5.7/en/).  
2, I recommend you to use some GUI DB tool like Navicat.  
3, excute the blogbackendDB.sql file by any DB management tool you like, I use Navicat.  
4, after that, my database shoule been copied on your local computer.  
5, my DB account name is root, my password is 12345678. You could set the same account and password like mine so you don't need to modify anything of the application.yml file.  
6, run your DB.
### Open and run with IDE, take IDEA as an example (I highly recommend you to use IntelliJ IDEA!!!)
1, open IDEA, click the Open button.  
2, select the pom.xml file in the project folder, and click the Open as Project button.  
3, my database port is 3306, and my database name is test, if you set these the same with mine, you don't need to modify anything of the project files.  
4, otherwise, please modify these parameters in the application.yml file in the resources folder.  
5, IDEA has already integrated maven, so you don't need any configuration, just wait for maven automatically grab every library this project need.  
6, when maven finish its job, just click the Run button of green color on the top bar of the window and it will run the RunService.  
<img width="287" alt="image" src="https://user-images.githubusercontent.com/117051280/217759834-d6d5a3b1-04c3-4270-b21b-233add778a34.png">  
6, when maven finish its job, just click the Run button of green color on the top bar of the window and it will run the DemoApplication.    
7, now I beileve the backend service is running on 8080 port.  
## Backend Service  
There are totally 8 main APIs in **BlogController.java** and **CommentController.java**:  

**BlogController:**  
*queryBlog*: query single blog info (title, content, authorId) by blogId.  
*queryBlogsByUser*: query all blogs of one single user.  
*queryUniBlogVO*: query completed info of a blog, include title, content, author's name and all the comments of this blog.  

**CommentController:**  
*queryCommentListByBlog*: query all the comments of a single blog.  
*addComment*: add comment to a blog.  
*updateComment*: modify one piece of comment.  
*deleteComment*:  delete a comment.  
*queryUserComments*: query all the comments written by someone.  

### How to send request (I recommend you to use Postman to send test requests)  
You can assemble the required parameters for requests follow the pictures below, all the requests were sent by Postman.  

queryBlog(blog/get/{blogId}):  
<img width="425" alt="image" src="https://user-images.githubusercontent.com/117051280/217763685-5dfe7bd3-4bf0-4f66-aaf4-a312ce19d427.png">  

queryBlogsByUser(blog/getbyuser/{userId}):  
<img width="487" alt="image" src="https://user-images.githubusercontent.com/117051280/217763814-ddad4429-339e-4da3-a597-91f8bdee124c.png">  

queryUniBlogVO(blog/getuniblog/{blogId}):  
<img width="586" alt="image" src="https://user-images.githubusercontent.com/117051280/217763950-a923be3b-a7a6-4407-87b4-ac640481911d.png">  

queryCommentListByBlog(/comment/get/{blogId}):  
<img width="480" alt="image" src="https://user-images.githubusercontent.com/117051280/217764038-1323d11f-caac-440d-b28c-ab0ac6897ae9.png">  

addComment(/comment/add):  
<img width="680" alt="image" src="https://user-images.githubusercontent.com/117051280/217764170-98340ec0-3a7f-4742-99c2-b18efcd267be.png">  

updateComment(/comment/update):  
<img width="585" alt="image" src="https://user-images.githubusercontent.com/117051280/217764231-6cfe5bab-d7bf-44f1-b699-305d0405b7a8.png">  

deleteComment(/comment/delete/{cmtId}):  
<img width="348" alt="image" src="https://user-images.githubusercontent.com/117051280/217764294-6b4d9372-f367-4349-a975-6ba1032e205d.png">  

queryUserComments(/comment/querybyuser/{userId}):  
<img width="593" alt="image" src="https://user-images.githubusercontent.com/117051280/217764347-074a71d3-1527-4360-98c8-0e88ec37dd97.png">  

###Unit Tests
I have created uint test sets for all the 8 APIs above:  
<img width="333" alt="image" src="https://user-images.githubusercontent.com/117051280/217764806-fc5c04d6-ee82-4822-a428-39a965c50f0c.png">  

You can easliy run these two test sets by executing the two files:  
<img width="576" alt="image" src="https://user-images.githubusercontent.com/117051280/217765165-bc806b78-db05-4d87-a40d-516c2bde746a.png">  

As I mentioned in the comment, please add a comment first and get the cmtid then do the test for deleteComment():  
<img width="902" alt="image" src="https://user-images.githubusercontent.com/117051280/217765249-6c99fcc7-4507-4f73-9582-91427486b554.png">









