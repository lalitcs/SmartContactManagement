<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
 <div class="container">
    <%@include file="navbar.jsp" %>
    <h2><b>Write Your Notes Here</b></h2>
    
    <!-- This is add Form -->
<form action="SaveNoteServlet" method="post">

  <div class="form-group">
   <label for="title"><b>Note Title</b></label>
    <input name="title"
    required 
    type="text" 
    class="form-control"
    id="title" 
    aria-describedby="emailHelp" 
    placeholder="Enter here"/>
    <small id="emailHelp" class="form-text text-muted"><b>Note Title Should Be Unique</b></small>
  </div>
  
  
  <div class="form-group">
    <label for="content"><b>Note Content</b></label>
    <textarea
    name="content" 
    required 
    id="content"
    placeholder="Enter your content here"
    class="form-control"
    style="height:350px;"
    ></textarea>
    
    
  </div>
   
    <div class="container text-center">
    <button type="submit" class="btn btn-success">Add Notes</button>
    </div>
</form>
    </div> 

</body>
</html>