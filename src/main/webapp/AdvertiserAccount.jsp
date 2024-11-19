<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Use this jstl tag to connect java classes and jsp -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${isAdvertiserLoggedIn}" >

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
					<div class="card text-center sidebar rounded-5 bg-light h-75 w-75 border border-dark">
						<div class="card-body">
							<!-- User image -->
							<img src="AdvertiserAccount.jpg" class="rounded-circle border border-dark"
								width="150">
							<div class="mt-3 container border border-white">
								<!-- 
                                <a href="">Home</a>
                                <a href="">work</a>
                                <a href="">Support</a>
                                <a href="">settings</a> -->
                                
                                <div class="d-flex align-items-center justify-content-center">
								<a href="advertiser_logout" style="color: black; width: 120px; font-size: 20px;" class="btn btn-outline-warning btn-sm fw-bold">Log Out</a>
								</div>


							</div>
						</div>
					</div>
				</div>
				<div class="col-md-8 mt-1">
					<!-- User profile content -->

					<c:forEach var="ads" items="${adsDetails}">

						<!-- this part for update (start) -->
						<!-- We use c:set tag to make variable to assign values -->

						<c:set var="id" value="${ads.id}" />
						<c:set var="name" value="${ads.name}" />
						<c:set var="email" value="${ads.email}" />
						<c:set var="phone" value="${ads.phone}" />
						<c:set var="username" value="${ads.userName}" />
						<c:set var="password" value="${ads.password}" />

						<!-- this part for update (end) -->




						<div class="card mb-3 content rounded-5 bg-white border border-dark">
							<h1 class="m-3 pt-3">${ads.name}</h1>
							<div class="card-body">
								<!-- User details section -->

								<!-- ID -->
								<div class="row">
									<div class="col-md-3">
										<h5>ID</h5>
									</div>
									<div class="col-md-9 text-secondary">
										${ads.id}
										<!-- call to the getID method in Advertiser.java page -->
									</div>
								</div>
								<hr>
								<!-- Name -->
								<div class="row">
									<div class="col-md-3">
										<h5>Name</h5>
									</div>
									<div class="col-md-9 text-secondary">
										${ads.name}
										<!-- call to the getName method in Advertiser.java page -->
									</div>
								</div>
								<hr>
								<!--Email -->
								<div class="row">
									<div class="col-md-3">
										<h5>Email</h5>
									</div>
									<div class="col-md-9 text-secondary">
										${ads.email}
										<!-- call to the getEmail method in Advertiser.java page -->
									</div>
								</div>
								<hr>
								<!-- Phone Number -->
								<div class="row">
									<div class="col-md-3">
										<h5>Phone Number</h5>
									</div>
									<div class="col-md-9 text-secondary">
										${ads.phone}
										<!-- call to the getPhone method in Advertiser.java page -->
									</div>
								</div>
								<hr>
								<!-- User Name -->
								<div class="row">
									<div class="col-md-3">
										<h5>User Name</h5>
									</div>
									<div class="col-md-9 text-secondary">
										${ads.userName}
										<!-- call to the getUserName method in Advertiser.java page -->
									</div>
								</div>
								<hr>
								<!-- Password -->
								<div class="row">
									<div class="col-md-3">
										<h5>Password</h5>
									</div>
									<div class="col-md-9 text-secondary">
										${ads.password}
										<!-- call to the getPassword method in Advertiser.java page -->
									</div>
								</div>

							</div>
						</div>

					</c:forEach>

				</div>

				<!-- page navigation use c:url tag -->
				<c:url value="AdvertiserUpdate.jsp" var="adsupdate">

					<!-- assign c:set var variables to c:parameter value -->

					<c:param name="id" value="${id}" />
					<c:param name="name" value="${name}" />
					<c:param name="email" value="${email}" />
					<c:param name="phone" value="${phone}" />
					<c:param name="Aname" value="${username}" />
					<c:param name="Apass" value="${password}" />
				</c:url>
	
	
		

		<div class="mt-5">

				<!-- pass c:url variable name to ancker tag-->
				<a href="${adsupdate}"> 
				<input type="button" name="update" value="Edit Account" class="btn btn-outline-primary btn-lg text-dark fw-bold">
				</a>
				
				
				
				
				<c:url value="AdvertiserDelete.jsp" var="adsdelete">
						
					<c:param name="id" value="${id}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="email" value="${email}"/>
					<c:param name="phone" value="${phone}"/>
					<c:param name="Aname" value="${username}"/>
					<c:param name="Apass" value="${password}"/>	
				
				</c:url>
				
				<a href="${adsdelete}">
				<input type="button" name="delete" value="Delete Account" class="btn btn-outline-danger btn-lg text-dark fw-bold">
				</a>
				
				
			</div>	
				
			</div>
		</div>
	</div>
</body>
</html>



</c:if>

<c:if test="${not isAdvertiserLoggedIn}" >

<c:redirect url="AdvertiserLogin.jsp"/>

</c:if>