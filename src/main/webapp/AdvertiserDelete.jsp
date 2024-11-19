<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<!-- Include the Bootstrap CSS file -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Include your custom CSS file -->
<link rel="stylesheet" href="AdvertiserAccount.css">



</head>
<body>
	<div class="container">
		<div class="main">

			<!-- Main content layout -->
			<div class="row">
				<div class="col-md-4 mt-1">
					<div class="card text-center sidebar rounded-5 bg-light h-75 w-75 border border-dark" >
						<div class="card-body">
							<!-- User image -->
							<img src="AdvertiserAccount.jpg" class="rounded-circle border border-dark"
								width="150">
							<div class="mt-3">
								<!-- 
                                <a href="">Home</a>
                                <a href="">work</a>
                                <a href="">Support</a>
                                <a href="">settings</a>
								<a href="" style="color: black;">Login Out</a> -->



							</div>
						</div>
					</div>
				</div>
				<div class="col-md-8 mt-1">
					<!-- User profile content -->


					<!-- Java Code -->
					<%
                                String id = request.getParameter("id");
                                String name = request.getParameter("name");
                                String email = request.getParameter("email");
                                String phone = request.getParameter("phone");
                                String username = request.getParameter("Aname");
                                String password = request.getParameter("Apass");

                    %>


					<form action="Delete" method="post">

						<div class="card mb-3 content rounded-5 bg-white border border-dark" >
							<h1 class="m-3 pt-3">Delete your Details</h1>
							<div class="card-body">
								<!-- User details section -->

								<!-- ID -->
								<div class="row">
									<div class="col-md-3">
										<h5>ID</h5>
									</div>
									<div class="col-md-9 text-secondary">
										<input type="text" name="adsid" value="<%= id %>" class="form-control rounded-3" readonly>

									</div>
								</div>
								<hr>
								<!-- Name -->
								<div class="row">
									<div class="col-md-3">
										<h5>Name</h5>
									</div>
									<div class="col-md-9 text-secondary">
										<input type="text" name="name" value="<%= name%>" class="form-control rounded-3" readonly>

									</div>
								</div>
								<hr>
								<!--Email -->
								<div class="row">
									<div class="col-md-3">
										<h5>Email</h5>
									</div>
									<div class="col-md-9 text-secondary">
										<input type="email" name="email" value="<%= email%>" class="form-control rounded-3" readonly>

									</div>
								</div>
								<hr>
								<!-- Phone Number -->
								<div class="row">
									<div class="col-md-3">
										<h5>Phone Number</h5>
									</div>
									<div class="col-md-9 text-secondary">
										<input type="text" name="phone" value="<%= phone%>" class="form-control rounded-3" readonly>

									</div>
								</div>
								<hr>
								<!-- User Name -->
								<div class="row">
									<div class="col-md-3">
										<h5>User Name</h5>
									</div>
									<div class="col-md-9 text-secondary">
										<input type="text" name="Aname" value="<%= username%>" class="form-control rounded-3" readonly>

									</div>
								</div>
								<hr>
								<!-- Password -->
								<div class="row">
									<div class="col-md-3">
										<h5>Password</h5>
									</div>
									<div class="col-md-9 text-secondary">
										<input type="password" name="Apass" value="<%= password %>" class="form-control rounded-3" readonly> 

									</div>
								</div>
							</div>
						</div>
						
							<input type="submit" name="submit" value="Delete Account" class="btn btn-outline-danger fw-bold btn-lg" style="color: black; width: 180px; font-size: 20px;">
					</form>
				</div>

			</div>
		</div>
	</div>
</body>
</html>