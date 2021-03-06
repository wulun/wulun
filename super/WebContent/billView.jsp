<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<header class="publicHeader">
    <h1>超市账单管理系统</h1>

    <div class="publicHeaderR">
        <p><span id="hours">下午好！</span><span style="color: #fff21b"> ${usename}</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li id="active"><a href="select.action">账单管理</a></li>
                <li ><a href="selectAll.action">供应商管理</a></li>
              <li><a href="selectAllUse.action">用户管理</a></li>
                <li><a href="passwordPage.action">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>账单管理页面 >> 信息查看</span>
        </div>
        <div class="providerView">
            <p><strong>订单编号：</strong><span>${bsl.bid}</span></p>
            <p><strong>商品名称：</strong><span>${bsl.billname}</span></p>
            <p><strong>商品单价：</strong><span>${bsl.price}</span></p>
            <p><strong>商品数量：</strong><span>${bsl.num}</span></p>
            <p><strong>总金额：</strong><span>${bsl.money}</span></p>
            <p><strong>供应商：</strong><span>${bsl.proid}</span></p>
            <p><strong>是否付款：</strong>
            <c:if test="${bsl.status eq 1}">
            	<span>已付款</span>
            </c:if>
            <c:if test="${bsl.status eq 2}">
            	<span>未付款</span>
            </c:if>
       		</p>
            <a href="selectBillAAA.action">返回</a> 
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>