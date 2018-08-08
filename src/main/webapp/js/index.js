!function(){
	
	window.fn = {};//在全局里面定义fn，这个fn就是该插件暴露的接口
	fn.snow = function(options){//这个snow就是我们在暴露接口里面扩展的方法
		var documentWidth = document.documentElement.clientWidth;//获取视口的宽度，可视区域的宽度
		var documentHeight = document.documentElement.clientHeight;//获取视口的高度，可视区域的宽度
		var myDiv1 = document.getElementById('div1');
		var defaults = {//定义默认情况的参数值，即用户没有输入任何参数的时候，你在程序里面要自动加的默认值
			minSize : 10,//最小的雪花尺寸
			maxSize : 15,//最大的雪花尺寸
			newOn : 2,//雪花刷新的频率，以毫秒为单位
			flakeColor : "#fff",//雪花的颜色
			flakeSpeed : 5//雪花降落的速度
		}
		
		var option = options || defaults; //或运算 有参数的时候选择参数 没有参数的时候 就选择默认情况的
		
		var inertval = setInterval(function(){
			
			var flake = document.createElement('div');//在文档（页面）创建一个元素
			
			var left = Math.random()*documentWidth;//用以个随机数来乘以视口的宽度
			
			var opacity = Math.random()+0.1;//设置雪花的透明度  设置随机的最小值为0.5 因为雪花不能透明（等于0）
			
			var size = Math.random()*(option.maxSize - option.minSize) + option.minSize;//设置雪花的大小
			
			flake.style.cssText = "border-radius:50%;position: absolute; width:"+ size 
									+"px;height:"+ size +"px;opacity:"+ opacity +";left:"+ left +"px;background:"
									+ option.flakeColor +";";//添加雪花的样式
			
			document.body.appendChild(flake);//将雪花节点添加到body里面去	
			
			animate(flake, option.flakeSpeed)
		},option.newOn) //设置一个定时器 里面有两个参数， 1.执行的什么 ， 2.时间 以毫秒为单位
		
		function animate(obj, speed){//这一块的用处是用定时器不断的刷新增加的top值，以达到下落的效果
			var top = 0;
			var timer = setInterval(function(){
				top += speed; //累加 speed
				obj.style.top = top + 'px';//赋值给这个对象的样式
				if(top > documentHeight){
					clearInterval(timer);//清除定时器
					obj.parentNode.removeChild(obj);
				}
			},13)
		}
	};
	
}()//匿名函数
