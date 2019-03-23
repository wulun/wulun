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
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>

    <div class="publicHeaderR">
        <p><span id="hours">下午好！</span><span style="color: #fff21b"> ${usename }</span> , 欢迎你！</p>
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
                <li><a href="selectAll.action">供应商管理</a></li>
               <li><a href="selectAllUse.action">用户管理</a></li>
                <li><a href="passwordPage.action">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>账单管理页面 >> 订单修改页面</span>
        </div>
        <div class="providerAdd">
            <form action="update.action">
                <!--div的class 为error是验证错误，ok是验证成功-->
                 <div>
                    <label for="providerid">商品编号：</label>
                    <input type="text" name="bid" id="bid" value="${bbb.bid}" readonly="true"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="providerName">商品名称：</label>
                    <input type="text" name="billname" id="billname" value="${bbb.billname}"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="people">商品单价：</label>
                    <input type="text" name="price" id="price" value="${bbb.price}" />
                    <span>*</span>
                </div>
                <div>
                    <label for="phone">商品数量：</label>
                    <input type="text" name="num" id="num" value="${bbb.num}"/>
                    <span>*</span>
                </div>
                <div>
                    <label for="address">总金额：</label>
                    <input type="text" name="money" id="money" value="${bbb.money}"/>
                    <span>*</span>
                </div>
               
                <div>
                    <label >是否付款：</label>
                    <c:if test="${bbb.status eq 2}">
                    <input type="radio" value="2" name="status" checked/>未付款
                    <input type="radio" value="1" name="status"/>已付款
                    </c:if>
                    <c:if test="${bbb.status eq 1}">
                    <input type="radio" value="2" name="status" />未付款
                    <input type="radio" value="1" name="status" checked/>已付款
                    </c:if>
                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <!--<a href="billList.html">返回</a>-->
                    <input type="submit" value="保存" "/>
                    <input type="button" value="返回" onclick="history.back(-1)"/>
                </div>
            </form>
        </div>

    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>