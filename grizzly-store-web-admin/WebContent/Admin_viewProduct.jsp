<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>View Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    
    <script src="scripts/main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="styles/main.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>

<body>

        <div  class="main_bodypage">
                <div class="row">
                    <div class="col">
                        <img src="images/logo.jpg" width=200px  height=65px>
                        <input  type="text" class="search_input" placeholder="Search"  >
                        <i id="nav_search_icon" class="fa fa-search"></i>
                    </div>
                    <div class="mg60 float_left"  >
                            <label class="mg60 fa fa-bell " ></label>
                            <label  class="mg20 ">Welcome , ${user.name }</label>
                           <a class="logoutbutton" href="LogoutServlet">Logout</a>
                    </div>
                </div>
            </div>
                    
        
            <div class="border profileCard_left_pos" >
                <h3 class="profileCard_top">Profile <small style="float: right;"> Edit</small></h3>
                <img src="images/blank.jfif" class="blank_image_style" >
              <p style="text-align:center"><b style="font-size:30px">${user.name }</b> <br><br> ID <br> ${user.userId }<br><br>Designation<br>${user.designation }<br><br>Office<br>${user.address }</p><br>
            </div>

            
            <div  class="main_divpage3">
                    <ul class="nav nav-pills" role="tablist">
                            <li class="nav-item pill">
                              <a class="tabbar nav-link active" data-toggle="pill" href="#addProduct">PRODUCT</a>
                            </li>
                            <li class="nav-item pill">
                              <a class="tabbar nav-link" data-toggle="pill" href="#vendorDiv">VENDOR</a>
                            </li>
                            
                    </ul>
                 
                <h3>Trimmer <small>by Philips <button class="pencil_button"><i class="fa fa-pencil pencil_icon"></i></button></small></h3>
                <p> <i class="fa fa-star" style="color: grey"></i> 4.7</p>
                <div class="place_bottom_parent main_divpage3_leftimg">
                    <i class="fa fa-pencil"></i>
                    <i class="fa fa-angle-left fa-3x float_left" style="margin-top: 150px;"></i>
                    <i class="fa fa-angle-right fa-3x " style="margin-top: 150px; float:right"></i>
                    <div class="place_bottom leftimg_label"> <p >Product Image Carousel</p> </div>

                </div >
                


                <div class="place_bottom_parent main_divpage3_rightdiv" >
                <h4>Product Description <small><button class="pencil_button"><i class="fa fa-pencil pencil_icon"></i></button></small></h4>
                <p style="width:280px height:200px">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quia vero ipsam assumenda explicabo qui iste optio? Veritatis alias perferendis blanditiis illum. Sapiente molestias labore esse quae voluptates laborum doloremque temporibus!
                A harum asperiores numquam eligendi esse deserunt et ad corporis! Eos aut architecto 
              </p>

                <div class=" place_bottom" >
                    <h3>Rs. XXXX/- <small>15%off</small></h3>
                </div>
                
                </div>

               
            </div>

            <div class="place_bottom_parent place_bottom_div" >
                    <div class="place_bottom" >
                    <button  class="above_other">Finish</button>
                    <button  class="above_other">Cancel</button>
                    </div>
                    </div>

            
    
</body>
</html>