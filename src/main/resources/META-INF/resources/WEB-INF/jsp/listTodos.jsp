<%@ include file="common/header.jsp" %>
<%@ include file="common/navigation.jsp" %>
<div class = "container">
	<h1>Your todos</h1>
	<table class ="table">
		  <thead>
			    <tr>
			        <th>Id</th>
			        <th>Description</th> 
			        <th>Target Date</th>
			        <th>Is Done?</th>
			        <th>Update</th>
			    </tr>
		   </thead>
	    <tbody>
		    <c:forEach items="${todos}" var="todo">
     <tr>
         <td>${todo.id}</td>
         <td>${todo.description}</td> 
         <td>${todo.targetDate}</td>
         <td>${todo.done}</td>
         <td><a href = "delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
         <td><a href = "update-todo?id=${todo.id}" class="btn btn-warning">Update</a></td>
     </tr>
	</c:forEach>
		  		 </tbody>
			</table>
			<a href ="add-todo" class="btn btn-success">Add todo</a>
</div>
<%@ include file="common/footer.jsp" %>