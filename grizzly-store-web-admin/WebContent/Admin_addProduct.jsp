<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Add Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="styles\main.css" />
    <script src="scripts\main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>


<body>
   

<div  class="main_bodypage ">
    <div class="row">
        <div class="col">
            <img src="images/logo.jpg" width=200px  height=65px>
            <input  type="text" placeholder="Search" class="search_input" name="search" >
            <i id="nav_search_icon" class="fa fa-search"></i>
        </div>
        <div class="mg60 float_left" >
                <label class="mg60 fa fa-bell " ></label>
                <label  class="mg20 ">Welcome , ${userName }</label>
                <a class="logoutbutton" href="LogoutServlet">Logout</a>
        </div>
    </div>
</div>

    
        <div class="border profileCard_left_pos" >
            <h3 class="profileCard_top">Profile <small style="float: right;">   Edit</small></h3>
            <img src="images/blank.jfif" class="blank_image_style" >
            <p style="text-align:center"><b style="font-size:30px">${userName }</b> <br><br> ID <br> GRZLY17234<br><br>Designation<br>Sr.Admin<br><br>Office<br>NYC,NY,USA</p><br>
            
        </div>

        <div class="main_div_window" >
            <input type="button" class="tabbar active" value="PRODUCTS" >
            <input type="Button" class="tabbar" value="VENDORS"  ><br><br><br>
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
            <input type="text" class="main_input" placeholder="Enter Product Id" ><br>
            <select class="main_input" >
                <option disabled selected>Category</option>
                <option>Electronics</option>
                <option>Grocery</option>
                <option>Fashion and Lifestyle</option>
            </select>
            <input type="text" class="main_input" placeholder="Name"><br>
            <input type="text" class="main_input" placeholder="Description"><br>
            <input type="text" class="main_input" placeholder="Price"><br>
            </div>
            <br>
           
            
            
       
    </div >

        <div class="place_bottom_parent place_bottom_div" >
        <div class="place_bottom" >
        <button  class="above_other ">Add</button>
        <button  class="above_other">Cancel</button>
        </div>
        </div>
    
</body>
</html>