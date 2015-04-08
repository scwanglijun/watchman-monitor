
// 路径配置
require.config({
    paths: {
        echarts: '../resources/global/plugins/echarts/build/dist'
    }
});
// 使用
require(
    [
        'echarts',
        'echarts/chart/pie' // 使用柱状图就加载bar模块，按需加载
    ],
    function (ec) {
        // 基于准备好的dom，初始化echarts图表
        var myChart = ec.init(document.getElementById('main')); 
        $.ajax({
        	type:'get',
        	url:'Options.json',
        	success:function(data){
        		data=JSON.stringify(data); 
        		data=data.toString().replace(/\[{2}/g, '[');
        		data=data.toString().replace(/\]{2}/g, ']');
        		data=JSON.parse(data);  
        		// 为echarts对象加载数据 
                myChart.setOption(data); 
        	}
        });
    }
);