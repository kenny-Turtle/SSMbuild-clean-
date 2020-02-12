<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }
        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入列表页</a>



</h3>
<div>
    <div class="col-md-4 column"></div>
    <div class="col-md-4 column">
        <form class="form-horizontal"
              action="${pageContext.request.contextPath}/user/queryUser?${username}?${password}">

            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-7">
                    <input type="text" class="form-control" name="username" id="username" placeholder="username">
                    <span style="color: red">${nameError}</span>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-7">
                    <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                    <span style="color: red">${pwdError}</span>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox"> Remember me
                        </label>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-primary">登录</button>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/toAddUser">注册</a>
                </div>
            </div>
        </form>
    </div>
    <div class="col-md-4 column"></div>


</div>
</body>
</html>