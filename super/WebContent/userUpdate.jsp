<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                <li id="active"><a href="selectAllUse">用户管理</a></li>
                <li><a href="passwordPage.action">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面 >> 用户修改页面</span>
        </div>
        <div class="providerAdd">
            <form action="userUpdate.action">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div>
                  <label >用户编码：</label>&nbsp;${useupdate.useid }
                    <input type="hidden" value="${useupdate.useid }" name="useid"/>
                    <input type="hidden" value="${useupdate.password }" name="password"/>
                    <input type="hidden" value="${useupdate.age }" name="age"/>
                </div>
                <div>
                    <label for="userName">用户名称：</label>
                    <input type="text" name="usename" id="usename" value="${useupdate.usename }"/>
                    <span >*</span>
                </div>

                <div>
                    <label >用户性别：</label>

                    <select name="sex">
                        <option value="男">男</option>
                        <option value="女" selected>女</option>
                    </select>
                </div>
                <div>
                    <label for="data">出生日期：</label>
                    <input type="text" name="birthday" id="birthday" value="${useupdate.birthday }"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="userphone">用户电话：</label>
                    <input type="text" name="tel" id="tel" value="${useupdate.tel }"/>
                    <span >*</span>
                </div>
                <div>
                    <label for="userAddress">用户地址：</label>
                    <input type="text" name="useaddress" id="useaddress" value="${useupdate.useaddress }"/>
                </div>
                <div>
                    <label >用户类别：</label>
                    <input type="radio" name="position" selected value="0"/>管理员
                    <input type="radio" name="position" value="1"/>普通用户

                </div>
                <div class="providerAddBtn">
                
                
                 <!-- <input type="submit" value="保存"> -->
                    <!--<a href="#">保存</a>-->
                    <!--<a href="userList.html">返回</a>-->
                    <input type="submit" value="保存" />
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