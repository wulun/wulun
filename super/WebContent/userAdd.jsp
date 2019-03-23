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
        <p><span id="hours" ></span><span style="color: #fff21b"> ${usename }</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
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
            <span>用户管理页面 >> 用户添加页面</span>
        </div>
        <div class="providerAdd">
            <form action="insertUse.action" >
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label>用户编码：</label>
                    <input type="text" name="useid" id="useid"/>
                    <span>*请输入用户编码，且不能重复</span>
                </div>
                <div>
                
                    <label >用户名称：</label>
                    <input type="text" name="usename" id="usename"/>
                    <span >*请输入用户名称</span>
                </div>
                <div>
                    <label>用户密码：</label>
                    <input type="text" name="password" id="password"/>
                    <span>*密码长度必须大于6位小于20位</span>

                </div>
             
                <div>
                    <label >用户性别：</label>

                    <select name="sex">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                    <span></span>
                </div>
                   <div>
                	<label>年龄:&nbsp;</label>
                	<input type="text" name="age" id="age"/>
                    <span>*请输入数字</span>
                
                </div>
                <div>
                    <label>出生日期：</label>
                    <input type="text" name="birthday" id="birthday"/>
                    <span >*</span>
                </div>
                <div>
                    <label>用户电话：</label>
                    <input type="text" name="tel" id="tel"/>
                    <span >*</span>
                </div>
                <div>
                    <label >用户地址：</label>
                    <input type="text" name="useaddress" id="useaddress"/>
                </div>
                <div>
                    <label >用户类别：</label>
                    <input type="radio" name="position" value="0"/>管理员
                
                    <input type="radio" name="position" value="1"/>普通用户
					<input type="radio" name="position" value="2"/>审核中
                </div>
                <div class="providerAddBtn">
                <input type="submit" value="添加" >
                
                  <!--   <a href="insertUse.action">添加</a>
                    <a href="userList.html">返回</a> -->
                  <!--   <input type="button" value="保存" onclick="history.back(-1)"/>
                    <input type="button" value="返回" onclick="history.back(-1)"/> -->
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