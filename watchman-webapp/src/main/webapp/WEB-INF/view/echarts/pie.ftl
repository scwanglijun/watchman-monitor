<#assign base = request.contextPath/>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head> 
<title>系统概要信息</title>
<!--lion UI JS Start-->
<script src="${base}/resources/global/js/lion.js" type="text/javascript"></script>
<script src="${base}/resources/global/plugins/echarts/build/dist/echarts.js" type="text/javascript"></script>
<script src="${base}/resources/admin/scripts/echarts/pie.js" type="text/javascript"></script>
<script src="${base}/resources/admin/scripts/admin-common.js" type="text/javascript"></script>
</head>
<body class="page-header-fixed page-sidebar-closed-hide-logo page-sidebar-closed-hide-logo">
	<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="height:400px"></div>
</body>
</html>