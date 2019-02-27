<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Add Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <script src="scripts\main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="styles\main.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>


<body>
   

<div  class="main_bodypage ">
    <div class="row">
        <div class="col">
            <img src="images/logo.jpg" width=200px  height=65px>
            <input  type="text" placeholder="Search" class="search_input"  >
            <i id="nav_search_icon" class="fa fa-search"></i>
        </div>
        <div class="mg60 float_left" >
                <label class="mg60 fa fa-bell " ></label>
                <label  class="mg20 ">Welcome , ${user.name }</label>
                <a class="logoutbutton" href="LogoutServlet">Logout</a>
        </div>
    </div>
</div>

    
        <div class="border profileCard_left_pos" >
            <h3 class="profileCard_top">Profile <small style="float: right;">   Edit</small></h3>
            <img src="images/blank.jfif" class="blank_image_style" >
            <p style="text-align:center"><b style="font-size:30px">${user.name }</b> <br><br> ID <br> ${user.userId }<br><br>Designation<br>${user.designation }<br><br>Office<br>${user.address }</p><br>
            
        </div>

        <div class="main_div_window" >
                <ul class="nav nav-pills" role="tablist">
                        <li class="nav-item pill">
                          <a class="tabbar nav-link active" data-toggle="pill" href="#addProduct">PRODUCT</a>
                        </li>
                        <li class="nav-item pill">
                          <a class="tabbar nav-link" data-toggle="pill" href="#vendorDiv">VENDOR</a>
                        </li>
                </ul>

                <br>
			<div class="tab-content">
			
            <div id="addProduct" class="tab-pane fade in active">
            
            <div class="float_left">
            <div class="place_bottom_parent plus_div" >
                <label class="mg10">1</label>
                <input type="image" src="images/plus_sign.png" width=200px height=182px style="margin: 50px 100px" >
                <div class="place_bottom" ><p class="img_label">Add Images</p> </div>
            </div>
            <div class="Style_button" Style="padding-top:10px">
            <button>2</button>
            <button>3</button>
            <button>4</button>
            <button>5</button>
            </div>
            </div>
            <div class="float_left main_input_div" >
            <form action="ProductServlet" method="Post">
            <input type="text" class="main_input" placeholder="Enter Product Id" name="productId"><br>
            <select class="main_input" name="categoryId" >
                <option disabled selected>Category</option>
                <option>Electronics</option>
                <option>Personal care</option>
                <option>Fashion and Lifestyle</option>
                <option>Art & supplies</option>
            </select>
            <input type="text" class="main_input" placeholder="Name" name="name"><br>
            <input type="text" class="main_input" placeholder="Description" name="description]"><br>
            <input type="text" class="main_input" placeholder="Price" name="price"><br>
            <input type="text" class="main_input" placeholder="Brand" name="brand"><br>
            </div>
            </div>
       
            
    
    
    <div id="vendorDiv" class="tab-pane fade">
    <h3>Vendor:</h3>
    </div>
    </div>
    
    </div>

        <div class="place_bottom_parent place_bottom_div " >
        <div class="place_bottom" >
        <button  class="above_other " type="submit">Add</button>
        <a  class="above_other" href="Admin_listProduct.jsp">Cancel</a>
        </form>
        </div>
        </div>
    
</body>
</html>