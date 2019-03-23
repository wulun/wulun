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
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="select.action">账单管理</a></li>
                <li id="active"><a href="selectAll.action">供应商管理</a></li>
                <li><a href="selectAllUse.action">用户管理</a></li>
                <li><a href="passwordPage.action">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>供应商管理页面</span>
        </div>
        <div class="search">
            <span>供应商名称：</span>
			<a href="selectAll.action">查询供应商</a>
            <a href="providerAdd.jsp">添加供应商</a>
        </div>
        <!--供应商操作表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="10%">供应商编码</th>
                <th width="20%">供应商名称</th>
                <th width="10%">联系人</th>
                <th width="10%">联系电话</th>
                <th width="10%">传真</th>
                <th width="10%">创建时间</th>
                <th width="10%">供应商地址</th>
                <th width="10%">描述</th>
                <th width="10%">操作</th>
            </tr>
            
			<c:forEach items="${allProvider }" var="aaa">
				<tr>
					<td>${aaa.proid }</td>
					<td>${aaa.providername }</td>
					<td>${aaa.contacts }</td>
					<td>${aaa.tel }</td>
					<td>${aaa.fax }</td>
					<td>${aaa.createtime }</td>
					<td>${aaa.proaddress }</td>
					<td>${aaa.describe }</td>
					<td>
					
                    <a href="providerView.action?proid=${aaa.proid }"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="providerUpdatePage.action?proid=${aaa.proid }"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="deleteProvider.action?proid=${aaa.proid }" ><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
            </tr>
 			</c:forEach>
        </table>

    </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeProv">
   <div class="removerChid">
       <h2>提示</h2>
       <div class="removeMain" >
           <p>你确定要删除该供应商吗？</p>
           <a href="#" id="yes">确定</a>
           <a href="#" id="no">取消</a>
       </div>
   </div>
</div>


<footer class="footer">
</footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>