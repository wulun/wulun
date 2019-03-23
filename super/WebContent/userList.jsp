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
            <p><span id="hours"></span><span style="color: #fff21b"> ${usename }</span> , 欢迎你！</p>
            <a href="login.jsp">退出</a>
        </div>
    </header>
<!--时间-->
    <section class="publicTime">
        <span id="time">2015年1月1日 11:11  星期一</span>
        <a href="#">这里有点东西</a>
    </section>
<!--主体内容-->
    <section class="publicMian ">
        <div class="left">
            <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
            <nav>
                <ul class="list">
                    <li ><a href="select.action">账单管理</a></li>
                <li><a href="selectAll.action">供应商管理</a></li>
                    <li  id="active"><a href="selectAllUse.action">用户管理</a></li>
                    <li><a href="passwordPage.action">密码修改</a></li>
                    <li><a href="login.jsp">退出系统</a></li>
                </ul>
            </nav>
        </div>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>用户管理页面</span>
            </div>
            <div class="search">
            <form action="selectByName.action" method="post">
                <span>用户名：</span>
                <input type="text" id="name" name="name" placeholder="请输入用户名"/>
                <input type="submit" value="查询" />
                <span id="search"></span>
                </form>
                <a href="insertPage.action">添加用户</a>
            </div>
            <!--用户-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">用户编码</th>
                    <th width="20%">用户名称</th>
                    <th width="10%">性别</th>
                    <th width="10%">年龄</th>
                    <th width="10%">电话</th>
                    <th width="10%">用户类型</th>
                    <th width="10%">用户地址</th>
                    <th width="20%">操作</th>
                </tr>
                <c:forEach var="info" items="${useList }">
                <tr>
                    <td>${info.useid }</td>
                    <td>${info.usename }</td>
                    <td>${info.sex }</td>
                    <td>${info.age }</td>
                    <td>${info.tel }</td>
                    <td>
	                    <c:if test="${info.position  eq 0}">
	                   		<c:set var="xyz" value="管理员"></c:set>
	 					</c:if>
	 					<c:if test="${info.position  eq 1}">
	                   		<c:set var="xyz" value="普通用户"> </c:set>
	 					</c:if>
	 					<c:if test="${info.position  eq 2}">
	                   		<c:set var="xyz" value="审核中"> </c:set>
	 					</c:if>
	 					${xyz }
                    </td>
                    <td>${info.useaddress }</td>
                 
                    <td>
                        <a href="userView.action?useid=${info.useid }"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="userUpdatePage.action?useid=${info.useid }"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="userDelete.action?useid=${info.useid }" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
                </c:forEach>
               
					</div>
		
            </table>
			<%-- <div class="header-info">
							
						共<span class="info-number">${page.dateSize}</span>
						<input type="hidden" value="" id = "PN">条结果，
						分成<span class="info-number">${page.PageTotal}</span>页显示，
						当前第<span class="info-number">${page.pageNum}</span>页.
						<font style="color:red "><span>${msg}</span></font>
					</div> --%>
					<%-- <div class="header-nav">
						<input type="button" class="clickbutton" value="首页"
							onclick="window.location.href='SearchEmployeesServlet?employeename=${param.employeename}&username=${param.username}&pageNum=1&status=${param.status }'" />
						<c:if test="${requestScope.pageNum ne '1'}">
							<input type="button" class="clickbutton" value="上页"
								onclick="window.location.href='SearchEmployeesServlet?employeename=${param.employeename}&username=${param.username}&pageNum=${requestScope.pageNum-1}&status=${param.status }'" />
						</c:if>
						<c:if test="${requestScope.pageNum ne requestScope.countOfPages}">
							<input type="button" class="clickbutton" value="下页"
								onclick="window.location.href='SearchEmployeesServlet?employeename=${param.employeename}&username=${param.username}&pageNum=${requestScope.pageNum+1}&status=${param.status }'" />
						</c:if>
						<input type="button" class="clickbutton" value="末页"
							onclick="window.location.href='SearchEmployeesServlet?employeename=${param.employeename}&username=${param.username}&pageNum=${requestScope.countOfPages}&status=${param.status }'" />
						跳到第<input type="text" id="pageNum" name="pageNum" class="nav-number" value=${ param.pageNum} maxlength="5">页 <input type="button"
							class="clickbutton" value="跳转" onclick="goToOnePage('${param.employeename}','${param.username}','${param.status}')" />
        </div> --%>
    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<%-- <div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>
            <a href="userDelete.action?useid=${info.useid }" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>
 --%>
    <footer class="footer">
    </footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>