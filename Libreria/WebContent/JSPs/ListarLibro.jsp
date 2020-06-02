<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>



<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="generator" content="Mobirise v4.12.3, mobirise.com">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1">
<link rel="shortcut icon"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/images/logo4.png"
	type="image/x-icon">
<meta name="description" content="">
<title>Registar</title>
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/web/assets/mobirise-icons/mobirise-icons.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/socicon/css/styles.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/dropdown/css/style.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/tether/tether.min.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/theme/css/style.css">
<link rel="preload" as="style"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/mobirise/css/mbr-additional.css">
<link rel="stylesheet"
	href="/Practica_02_Servlets_JSP_y_JPA/assets/mobirise/css/mbr-additional.css"
	type="text/css">
</head>

<body>
	<section class="menu cid-rYLp6CYX3Y" once="menu" id="menu1-h">



		<nav
			class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm">
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<div class="hamburger">
					<span></span> <span></span> <span></span> <span></span>
				</div>
			</button>
			<div class="menu-logo">
				<div class="navbar-brand">
					<span class="navbar-logo"> <a
						href="/Practica_02_Servlets_JSP_y_JPA/index.html"> <img
							src="/Practica_02_Servlets_JSP_y_JPA/assets/images/mbr-192x192.png"
							alt="Mobirise" title="" style="height: 3.8rem;"></a>
					</span>

				</div>
			</div>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">


			</div>
		</nav>
	</section>

	<section class="engine">
		<a href="https://mobirise.info/y">html web templates</a>
	</section>
	<section class="mbr-section form1 cid-rYLpiKVRDR" id="form1-i">




		<div class="container">
			<div class="row justify-content-center">
				<div class="title col-12 col-lg-8">
					<h2
						class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">Agenda
						Telefonica</h2>
					<h3
						class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">Registar
					</h3>
				</div>
			</div>
		</div>
		<div class="">
			<div class="container">
				<div class="row">
					<div class="col-md-12 order-md-1">
						<!---Formbuilder Form--->
						<form action="/Practica_02_Servlets_JSP_y_JPA/ControladorRegistrar"
							method="post" class="mbr-form form-with-styler"
							data-form-title="Mobirise Form">
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="nombre">Nombre:</label> <input type="text"
										id="nombre" name="nombre" value="${nombre}"
										placeholder="Ingrese nombres" minlength="3" maxlength="48"
										class="form-control" />
									<div style="color: red;">${requestScope.validacionesNombre}</div>
								</div>

								<div class="col-md-6 mb-3">
									<label for="apellido">Apellido:</label> <input type="text"
										id="apellido" name="apellido" value="${apellido}"
										placeholder="Ingrese apellidos" minlength="3" maxlength="48"
										class="form-control" />
									<div style="color: red;">${requestScope.validacionesApellido}</div>
								</div>
							</div>

							<div class="mb-3">
								<label for="email">Correo Electronico:</label> <input
									type="email" id="email" name="email" maxlength="97"
									value="${correo}" placeholder="Ingrese correo"
									class="form-control" />
								<div style="color: red;">${requestScope.validacionesCorreo}</div>
							</div>
							<div class="mb-3">
								<label for="identificacion">Cedula:</label> <input type="text"
									id="identificacion" name="cedula" value="${cedula}"
									placeholder="Ingrese cedula" maxlength="10"
									class="form-control" />
								<div style="color: red;">${requestScope.validacionesCedula}</div>
							</div>
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="password">Contraseña:</label> <input
										type="password" id="password" name="password" value="${pass}"
										placeholder="Ingrese contraseña" class="form-control" />
									<div style="color: red;">${requestScope.validacionesPassw}</div>
								</div>

								<div class="col-md-6 mb-3">
									<label for="password">Confirmar Contraseña:</label> <input
										type="password" id="confirma" name="confirma"
										value="${confirma}" placeholder="Ingrese contraseña"
										class="form-control" />
									<div style="color: red;">${requestScope.validacionesPasswConf}</div>
								</div>
							</div>

							<br /> <input class="btn btn-primary btn-large btn-block"
								type="submit" name="Ingresar" value="Registrarse" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>


	<section class="engine">
		<a href="#">free html templates</a>
	</section>
	<section class="cid-qTkAaeaxX5" id="footer1-2">



		<div class="container">
			<div class="media-container-row content text-white">
				<div class="col-12 col-md-3">
					<div class="media-wrap">
						<a href="/Practica_02_Servlets_JSP_y_JPA/index.html"> <img
							src="/Practica_02_Servlets_JSP_y_JPA/assets/images/mbr-192x192.png"
							alt="Mobirise" title=""></a>
					</div>
				</div>
				<div class="col-12 col-md-3 mbr-fonts-style display-7">
					<h5 class="pb-3">Direccion&nbsp;</h5>
					<p class="mbr-text">Ricaurte - 4 esquinas</p>
				</div>
				<div class="col-12 col-md-3 mbr-fonts-style display-7">
					<h5 class="pb-3">Contacto</h5>
					<p class="mbr-text">
						Email: wilsonbc96@gmail.com<br>Celular: 0992571228
					</p>
				</div>
				<div class="col-12 col-md-3 mbr-fonts-style display-7">
					<h5 class="pb-3"></h5>
					<p class="mbr-text"></p>
				</div>
			</div>
			<div class="footer-lower">
				<div class="media-container-row">
					<div class="col-sm-12">
						<hr>
					</div>
				</div>
				<div class="media-container-row mbr-white">
					<div class="col-sm-6 copyright">
						<p class="mbr-text mbr-fonts-style display-7">Â© Copyright
							2020 Wilson Barbecho - All Rights Reserved</p>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</section>


	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/web/assets/jquery/jquery.min.js"></script>
	<script src="/Practica_02_Servlets_JSP_y_JPA/assets/popper/popper.min.js"></script>
	<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/smoothscroll/smooth-scroll.js"></script>
	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/dropdown/js/nav-dropdown.js"></script>
	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/dropdown/js/navbar-dropdown.js"></script>
	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script src="/Practica_02_Servlets_JSP_y_JPA/assets/tether/tether.min.js"></script>
	<script src="/Practica_02_Servlets_JSP_y_JPA/assets/theme/js/script.js"></script>
	<script
		src="/Practica_02_Servlets_JSP_y_JPA/assets/formoid/formoid.min.js"></script>


</body>

</html>