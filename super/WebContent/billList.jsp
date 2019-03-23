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
            <a href="login.jsp">退出</a>
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
        <form action="selectBillAll.action" method="post">
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>账单管理页面</span>
            </div>
            
            <div class="search">
                <span>商品名称：</span>
                <input type="text" placeholder="请输入商品的名称" name="billname"/>
                
        <!--         <span>供应商：</span>
                <select name="tigong" >
                    <option value="">--请选择--</option>
                    <option value="">北京市粮油总公司</option>
                    <option value="">邯郸市五得利面粉厂</option>
                </select> -->

                <span>是否付款：</span>
                <select name="status">
                    <option value="0">--请选择--</option>
                    <option value="1">已付款</option>
                    <option value="2">未付款</option>
                </select>
                <input type="submit" value="查询"/>     
                <a href="selectByProName.action">添加订单</a>
            </div>
            <!--账单表格 样式和供应商公用-->
            <table class="providerTable" cellpadding="0" cellspacing="0">
                <tr class="firstTr">
                    <th width="10%">账单编码</th>
                    <th width="20%">商品名称</th>
                    <th width="10%">供应商</th>
                    <th width="10%">账单金额</th>
                    <th width="10%">是否付款</th>
                    <th width="10%">创建时间</th>
                    <th width="30%">操作</th>
                </tr>
                <c:forEach items="${list}" var="bill" >
                <tr>
                    <td>${bill.bid}</td>
                    <td>${bill.billname}</td>
                    <td>${bill.proid}</td>
                    <td>${bill.money}</td>
                    <td>
                    <c:if test="${bill.status eq 1}">
                    	已付款
                    </c:if>
                    <c:if test="${bill.status eq 2}">
                    	未付款
                    </c:if>
                    </td>
                    <td>${bill.createtime}</td>
                    <td>
                        <a href="selectById.action?bid=${bill.bid}"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="updateselect.action?bid=${bill.bid}"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="deletebill.action?bid=${bill.bid}" class="removeBill"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>
                </c:forEach>
            </table>
        </div>
        </form>
    </section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<%--        <div class="remove" id="removeBi">
  		  <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该订单吗？</p>
            <a href="deletebill.action?bid=${bill.bid} id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div> --%>

    <footer class="footer">
    </footer>

<script src="js/jquery.js"></script>
<script src="js/js.js"></script>
<script src="js/time.js"></script>

</body>
</html>