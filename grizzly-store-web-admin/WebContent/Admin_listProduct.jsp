<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>List Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <script src="scripts/main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="styles\main.css" >
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>

<body>

    <div  class="main_bodypage ">
        <div class="row">
            <div class="col">
                <img src="images/logo.jpg" width=200px  height=65px>
                <input  type="text" placeholder="Search" class="search_input" >
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
        <h3 class="profileCard_top">Profile <small style="float: right;">   Edit</small></h3>
        <img src="images/blank.jfif" class="blank_image_style" >
        <p style="text-align:center"><b style="font-size:30px"> ${user.name }</b> <br><br> ID <br> ${user.userId }<br><br>Designation<br>${user.designation }<br><br>Office<br>${user.address }</p><br>
        
    </div>

            <div class="main_divpag32 border">
                <ul class="nav nav-pills" role="tablist">
                    <li class="nav-item pill">
                      <a class="tabbar nav-link active" data-toggle="pill" href="#addProduct">PRODUCT</a>
                    </li>
                    <li class="nav-item pill">
                      <a class="tabbar nav-link" data-toggle="pill" href="#vendorDiv">VENDOR</a>
                    </li>
                    <li class="nav-item pill-1">
                        <a class="tabbar2 nav-link" data-toggle="pill" href="#check"> </a>
                    </li>
                </ul>

                <div class="main_subdivpag32">
                    
                    
                    <select class="input_fieldpage2" disabled >
                                <option>Choose Category</option>
                    </select>
                    <input type="text" class="input_fieldpage2" placeholder="Search Category">
                    <i id="filtersubmitCategory" class="fa fa-search"></i>
                    <select class="input_fieldpage2"  >
                            <option disabled selected>Sort By</option>
                            <option>Brand</option>
                            <option>Rating</option>
                            <option>Category</option>
                    </select>
                    <a class="add_productbtn" href="ProductServlet">Add Product</a>
                    
                </div>

                <div class="table_enhnc">
                        <table class="table table-bordered noBorder" style="border: 2px solid white;">
                                <thead>
                                  <tr>
                                    <th scope="col"></th>
                                    <th scope="col">Product List</th>
                                    <th scope="col">Brand</th>
                                    <th scope="col">Category</th>
                                    <th scope="col">Rating</th>
                                    <th scope="col"></th>
                                  </tr>
                                </thead>
                                <tbody >
                                <c:forEach items="${Prod}" var="prod">
                                  <tr>
                                    <td><div class="round">
                                            <input type="checkbox" id="checkbox" >
                                            <label for="checkbox"></label>
                                          </div>
                                        </td>
                                    <td><c:out value="${prod.name}"/></td>
                                    <td><c:out value="${prod.brand}"/></td>
                                    <td><c:out value="${prod.categoryId}"/></td>
                                    <td><c:out value="${prod.rating}"/></td>
                                    <td>
                                            <button disabled>View</button>
                                            <button disabled>Block</button>
                                            <button disabled>Remove</button>
                                    </td>
                                  </tr>
                                  </c:forEach>
                           		</tbody>
                              </table>
                </div>
                
            </div>

            


    
</body>
</html>