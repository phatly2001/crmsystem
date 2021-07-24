<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CRM-Login</title>
<!-- bootstrap -->
<link href="/webjars/bootstrap/5.0.1/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="/assets/css/myStyle.css">
<!-- bootstrap icon -->
<link rel=" stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<body style="background:linear-gradient(to left, #d87e70,#d87093);">
    <div class="container">
        <div class="row justify-content-center ">
            <img src="assets/img/finder.jpeg" class="img-finder" height="35">
            <img src="assets/img/imac.png" class="img-imac">
            <img src="assets/img/dock.png" class="img-dock" height=50">
        </div>
        <div class="circle-1"></div>
        <div class="circle-2"></div>
        <div class="circle-3"></div>
        <div class="row justify-content-center">
            <div class="login-block">
                <div class="card rounded shadow-lg p-3">
                    <div class="row ">
                        <div class="col-6">
                            <img src="assets/img/login.png" alt="" height="500" width="500">
                        </div>
                        <div class="col-6  my-5">
                            <div class="card-title text-center">
                                <h1 class="logo text-center align-content-center"><i class="bi bi-terminal-fill"></i>
                                    CRM
                                </h1>
                            </div>
                            <div class="card-body">
                               <div class="form-floating mb-3">
  <input type="email" class="form-control rounded" id="floatingInput" placeholder="name@example.com">
  <label for="floatingInput">Email</label>
</div>
                               <div class="form-floating mb-3">
  <input type="password" class="form-control rounded" id="floatingInput" placeholder="Password">
  <label for="floatingInput">Password</label>
</div>
                                <div class="row align-items-center p-2">
                                    <div class="col-8">
                                        <div class="form-check form-switch ">
                                            <input class="form-check-input" type="checkbox">
                                            <label class="form-check-label" for="flexSwitchCheckChecked">Remember me</label>
                                        </div>
                                    </div>
                                    <div class="col-4 ">
                                        <a href="#" class="main-color  link-color" > Forgot Password ?</a>
                                    </div>
                                </div>
                              
                            </div>
                            <div class="row justify-content-center" >
                                <input type="submit" class="btn myBtn " value="Log In">
                            </div>
                            <div class="row  text-center p-3">
                                <span>Don't have accounts? <a href="#" class="link-color"> Create one!</a></span>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <section class="footer">
            <div class="container p-3">
                <div class="row align-items-center">
                    <div class="col-6">
                        <div class="copyright  text-lg-left">
                            ©
                            <script>
                                document.write(new Date().getFullYear())
                            </script>,
                            made with <i class="bi bi-heart-fill" style="color:red"></i> by Pat
                        </div>
                    </div>
                    <div class="col-6 ">
                        <div class="support-block  text-lg-left float-end">
                            <div class="navbar navbar-expand-lg navbar-light">
                                <ul class="navbar-nav">
                                    <li class="nav-item">
                                        <a href="#" class="nav-link"> Blog </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="#" class="nav-link"> Help </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="#" class="nav-link"> Terms </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="#" class="nav-link"> Privacy </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>

    <!-- script -->
   
    <!-- bootstrap script -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- chart -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.4.1/chart.min.js"></script>


</body></html>