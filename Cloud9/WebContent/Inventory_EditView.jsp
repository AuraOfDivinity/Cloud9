<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Edit Item</title>

<!-- Fontfaces CSS-->
<link href="css/font-face.css" rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
	media="all">

<!-- Vendor CSS-->
<link href="vendor/animsition/animsition.min.css" rel="stylesheet"
	media="all">
<link
	href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="vendor/wow/animate.css" rel="stylesheet" media="all">
<link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
	media="all">
<link href="vendor/slick/slick.css" rel="stylesheet" media="all">
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
	<div class="page-wrapper">
		<!-- HEADER MOBILE-->
		<header class="header-mobile d-block d-lg-none">
			<div class="header-mobile__bar">
				<div class="container-fluid">
					<div class="header-mobile-inner">
						<a class="logo" href="index.html"> <img
							src="images/icon/logo.png" alt="CoolAdmin" />
						</a>
						<button class="hamburger hamburger--slider" type="button">
							<span class="hamburger-box"> <span class="hamburger-inner"></span>
							</span>
						</button>
					</div>
				</div>
			</div>
			<nav class="navbar-mobile">
				<div class="container-fluid">
					<ul class="navbar-mobile__list list-unstyled">
						<li><a class="js-arrow" href="#"> <i
								class="fas fa-tachometer-alt"></i>Dashboard
						</a></li>
						<li><a href="Inventory_Reports.jsp"> <i class="fas fa-chart-bar"></i>Charts
						</a></li>
						<li><a href="table.html"> <i class="fas fa-table"></i>Tables
						</a></li>
						<li><a href="form.html"> <i class="far fa-check-square"></i>Forms
						</a></li>
						<li><a href="#"> <i class="fas fa-calendar-alt"></i>Calendar
						</a></li>
						<li><a href="map.html"> <i class="fas fa-map-marker-alt"></i>Maps
						</a></li>
						<li class="has-sub"><a class="js-arrow" href="#"> <i
								class="fas fa-copy"></i>Pages
						</a>
							<ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
								<li><a href="login.html">Login</a></li>
								<li><a href="register.html">Register</a></li>
								<li><a href="forget-pass.html">Forget Password</a></li>
							</ul></li>
						<li class="has-sub"><a class="js-arrow" href="#"> <i
								class="fas fa-desktop"></i>UI Elements
						</a>
							<ul class="navbar-mobile-sub__list list-unstyled js-sub-list">
								<li><a href="button.html">Button</a></li>
								<li><a href="badge.html">Badges</a></li>
								<li><a href="tab.html">Tabs</a></li>
								<li><a href="card.html">Cards</a></li>
								<li><a href="alert.html">Alerts</a></li>
								<li><a href="progress-bar.html">Progress Bars</a></li>
								<li><a href="modal.html">Modals</a></li>
								<li><a href="switch.html">Switchs</a></li>
								<li><a href="grid.html">Grids</a></li>
								<li><a href="fontawesome.html">Fontawesome Icon</a></li>
								<li><a href="typo.html">Typography</a></li>
							</ul></li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- END HEADER MOBILE-->

		<!-- MENU SIDEBAR-->
		<aside class="menu-sidebar d-none d-lg-block">
			<div class="logo">
				<a href="#"> <img src="images/icon/logo.png" alt="Cool Admin" />
				</a>
			</div>
			<div class="menu-sidebar__content js-scrollbar1">
				<nav class="navbar-sidebar">
					<ul class="list-unstyled navbar__list">

						<li><a href="Inventory_Dashboard.jsp"> <i
								class="fas fa-tachometer-alt"></i>Dashboard
						</a></li>
						<li><a href="chart.html"> <i class="fas fa-chart-bar"></i>Reports
						</a></li>

						<li class="active has-sub"><a href="Inventory_Add.jsp"> <i
								class="far fa-plus-square"></i>Add Items
						</a></li>
						
						<li><a href="Inventory_ViewAll.jsp"> <i
								class="fas fa-eye"></i>View All
						</a></li>

						<li class="has-sub"><a class="js-arrow" href="#"> <i
								class="fas fa-copy"></i>Pages
						</a>
							<ul class="list-unstyled navbar__sub-list js-sub-list">
								<li><a href="login.html">Login</a></li>
								<li><a href="register.html">Register</a></li>
								<li><a href="forget-pass.html">Forget Password</a></li>
							</ul></li>
					</ul>
				</nav>
			</div>
		</aside>
		<!-- END MENU SIDEBAR-->

		<!-- PAGE CONTAINER-->
		<div class="page-container">
			<!-- HEADER DESKTOP-->
			<header class="header-desktop">
				<div class="section__content section__content--p30">
					<div class="container-fluid">
						<div class="header-wrap">
							<form class="form-header" action="" method="POST">
								<input class="au-input au-input--xl" type="text" name="search"
									placeholder="Search for datas &amp; reports..." />
								<button class="au-btn--submit" type="submit">
									<i class="zmdi zmdi-search"></i>
								</button>
							</form>
							<div class="header-button">
								
								<div class="account-wrap">
									<div class="account-item clearfix js-item-menu">
										<div class="image">
											<img src="images/icon/avatar-01.jpg" alt="John Doe" />
										</div>
										<div class="content">
											<a class="js-acc-btn" href="#">Asel Peiris</a>
										</div>
										<div class="account-dropdown js-dropdown">
											<div class="info clearfix">
												<div class="image">
													<a href="#"> <img src="images/icon/avatar-01.jpg"
														alt="John Doe" />
													</a>
												</div>
												<div class="content">
													<h5 class="name">
														<a href="#">Asel Peiris</a>
													</h5>
													<span class="email">peirisasel373@gmail.com</span>
												</div>
											</div>
											
											<div class="account-dropdown__footer">
												<a href="Log.jsp"> <i class="zmdi zmdi-power"></i>Logout
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</header>
			<!-- END HEADER DESKTOP-->

			<!-- MAIN CONTENT-->
			<div class="main-content">
				<div class="section__content section__content--p30">
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">


								<div class="card">
									<div class="card-header">Inventory Management System</div>
									<%@ page import="java.util.List"%>
									<%@ page import="Inventory_Asel.*"%>
									<%@ page import="javax.servlet.http.HttpSession"%>

									<%
										HttpSession s1 = request.getSession();
										int id= Integer.parseInt(s1.getAttribute("displayID").toString());
										Item I = ItemDao.searchSpecific(id);
									%>
									<div class="card-body">
										<div class="card-title">
											<h3 class="text-center title-2">Editing item -<%=I.getName() %></h3>
										</div>
										<p>Please fill in the required fields to be edited!</p>
										<hr>
										<form action="EditItem" method="post" onsubmit="return confirm('Do you really want to edit this item?');">
											<div class="form-group">
												<label for="cc-payment" class="control-label mb-1">Name</label>
												<input id="cc-payment" pattern="[A-Za-z0-9 ]*" name="itemName" type="text"
													class="form-control" aria-required="true"
													aria-invalid="false">
											</div>
											<div class="row">
												<div class="col-6">
													<div class="form-group">
														<label for="cc-exp" class="control-label mb-1">Quantity</label>
														<input id="cc-exp" pattern="[0-9]+" name="itemQuantity" type="text"
															class="form-control cc-exp" value=""> <span
															class="help-block" data-valmsg-for="cc-exp"
															data-valmsg-replace="true"></span>
													</div>
												</div>
												<div class="col-6">
													<div class="form-group">
														<label for="cc-exp" class="control-label mb-1">Image
															link</label> <input id="cc-exp" name="itemLink" type="text"
															class="form-control cc-exp" value="" > <span
															class="help-block" data-valmsg-for="cc-exp"
															data-valmsg-replace="true"></span>
													</div>
												</div>
											</div>

											<div class="form-group">
												<label for="cc-number" class="control-label mb-1">Supplier</label>
												<input id="cc-number" pattern="[A-Za-z]+" name="itemSupplier" type="text"
													class="form-control cc-number identified visa" value="">
												<span class="help-block" data-valmsg-for="cc-number"
													data-valmsg-replace="true"></span>
											</div>
											<div class="row">
												<div class="col-6">
													<div class="form-group">
														<label for="cc-exp" class="control-label mb-1">Expiration</label>
														<input id="cc-exp" pattern="[0-9]{2}[/][0-9]{4}" name="itemExpiration" type="text"
															class="form-control cc-exp" value="" data-val="true"
															data-val-required="Please enter the card expiration"
															data-val-cc-exp="Please enter a valid month and year"
															placeholder="MM / YYYY" autocomplete="cc-exp"> <span
															class="help-block" data-valmsg-for="cc-exp"
															data-valmsg-replace="true"></span>
													</div>
												</div>
												<div class="col-6">
													<label for="x_card_code" class="control-label mb-1">Buying
														Price</label>
													<div class="input-group">
														<input id="x_card_code" pattern="[0-9.]+" name="itemPrice" type="text"
															class="form-control cc-cvc" value="" data-val="true"
															data-val-required="Please enter the security code"
															data-val-cc-cvc="Please enter a valid security code"
															autocomplete="off">

													</div>
												</div>
											</div>
											<div class="form-group">
												<label for="cc-payment" class="control-label mb-1">Description</label>
												<input id="cc-pament" name="itemDescription" type="text"
													class="form-control" aria-required="true"
													aria-invalid="false">
											</div>
											<div>
												<button id="payment-button" type="submit"
													class="btn btn-lg btn-primary btn-block" onClick="AddItem">
													<i class="fa fa-edit fa-lg"></i>&nbsp; <span
														id="payment-button-amount">Edit</span> <span
														id="payment-button-sending" style="display: none;">Sending</span>
												</button>
											</div>
										</form>
									</div>
								</div>


							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- END PAGE CONTAINER-->

	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery-3.2.1.min.js"></script>
	<script src="vendor/bootstrap-notify.js"></script>
	<!-- Bootstrap JS-->
	<script src="vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="vendor/slick/slick.min.js">
		
	</script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="vendor/animsition/animsition.min.js"></script>
	<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="vendor/circle-progress/circle-progress.min.js"></script>
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="vendor/select2/select2.min.js">
		
	</script>

	<!-- Main JS-->
	<script src="js/main.js"></script>

	<script type="text/javascript">
		function myFunction() {
			$.notify({
				icon : 'ti-gift',
				message : "Item successfully added!"

			}, {
				type : 'success',
				timer : 4000
			});
		}
	</script>

</body>

</html>
<!-- end document-->