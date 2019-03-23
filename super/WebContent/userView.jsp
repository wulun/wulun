<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.text.DateFormat,java.text.SimpleDateFormat,java.util.Date"
   %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>

    <div class="publicHeaderR">
        <p><span id="hours">下午好！</span><span style="color: #fff21b">${usename }</span> , 欢迎你！</p>
        <a href="login.jsp">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                 <li id="active"><a href="select.action">账单管理</a></li>
                <li><a href="selectAll.action">供应商管理</a></li>
                <li id="active"><a href="selectAllUse.action">用户管理</a></li>
                <li><a href="passwordPage.action">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户信息查看页面</span>
        </div>
        <div class="providerView">
        	
      
            <p><strong>用户编号：</strong><span>${use.useid }</span></p>
            <p><strong>用户名称：</strong><span>${use.usename }</span></p>
            <p><strong>用户性别：</strong><span>${use.sex }</span></p>
            <p><strong>出生日期：</strong><span>${str }</span></p>
            <p><strong>用户电话：</strong><span>${use.tel }</span></p>
            <p><strong>用户地址：</strong><span>${use.useaddress }</span></p>
            <p><strong>用户类别：</strong>
            <span>
				  <c:if test="${use.position  eq 0}">
	                   		<c:set var="xyz" value="管理员"></c:set>
	 					</c:if>
	 					<c:if test="${use.position  eq 1}">
	                   		<c:set var="xyz" value="普通用户"> </c:set>
	 					</c:if>	
	 					<c:if test="${use.position  eq 2}">
	                   		<c:set var="xyz" value="审核中"> </c:set>
	 					</c:if>
	 					${xyz }									
			</span></p>

            <a href="selectAllUse.action">返回</a>
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>