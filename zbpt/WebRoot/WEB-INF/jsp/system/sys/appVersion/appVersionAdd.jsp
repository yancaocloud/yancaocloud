<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'departmentEdit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!--bootstrap 配置-->
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.min.css">
	<script type="text/javascript" src="resources/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/jquery/jquery_form.js"></script>
	<!-- bootstrap-table 配置-->
	<link rel="stylesheet" type="text/css" href="resources/plugins/bootstrap-table/bootstrap-table.min.css">
	<script type="text/javascript" src="resources/plugins/bootstrap-table/bootstrap-table.min.js"></script>
	<script type="text/javascript" src="resources/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
	<script type="text/javascript" src="resources/plugins/layer/layer.js"></script>
	<link rel="stylesheet" type="text/css" href="resources/plugins/toastr/toastr.min.css">
	<script type="text/javascript" src="resources/plugins/toastr/toastr.min.js"></script>
	<!-- 业务 配置 -->
	<script type="text/javascript" src="resources/js/system/common/sysPower.js"></script>
	<script type="text/javascript" src="resources/js/system/pageInfoCfg.js"></script>
	<script type="text/javascript" src="resources/js/system/common/communal.js"></script>
	<link rel="stylesheet" type="text/css" href="resources/bootstrap/css/bootstrap.my.css">
	<!-- bootstrap表单验证 -->
	<link rel="stylesheet" href="resources/plugins/bootstrapValidator/css/bootstrapValidator.css" />
	<script type="text/javascript" src="resources/plugins/bootstrapValidator/js/bootstrapValidator.js"></script>
	<script type="text/javascript" src="resources/plugins/bootstrapValidator/js/bootstrapValidator.local.js"></script>
	
  </head>
  <script type="text/javascript">
	  
	  	
	  	
	function formValidatorInit () {
					$("#appVersionForm").bootstrapValidator({
						message: 'This value is not valid',
						feedbackIcons: {
							valid: 'glyphicon glyphicon-ok',
							invalid: 'glyphicon glyphicon-remove',
							validating: 'glyphicon glyphicon-refresh'
						},
						fields: {
							is_update: {
								group : '.col-xs-9',
								message: '更新类型验证失败',
								validators: {
									notEmpty: {
										message: '更新类型不能为空'
									}
								}
							},
							v_name: {
								group : '.col-xs-9',
								message: '版本名称验证失败',
								validators: {
									notEmpty: {
										message: '版本名称不能为空'
									},
									stringLength : {
									    min : 1,
										max : 20,
										message : '版本名称不能大于20个字符'
									}
								}
							},
							v_code: {
								group : '.col-xs-9',
								message: '版本编号验证失败',
								validators : {
									notEmpty : {
										message : '版本编号不能为空'
									},
									stringLength : {
										max : 10,
										message : '版本编号不能大于10个字符'
									},
									regexp: {
										regexp:  /([1-9]{1}).([0-9]{2}).([0-9]{3})$/,
										message: '版本编号格式有误'
									}
								}
							},
							bz: {
								group : '.col-xs-9',
								message: '版本备注验证失败',
								validators : {
									stringLength : {
										max : 500,
										message : '版本备注不能大于500个字符'
									}
								}
							}
						}
					});
				};
				
				//提交数据
					//提交数据
			function submitForm() {
				$("#appVersionForm").bootstrapValidator("validate"); //验证
				var file = $('#file').val();
				if(file == ''){
					top.toastr.error('请上传文件');
					return ;
				}else {
				   name = file.substring(file.length-4,file.length);
				   if(name != '.apk'){
				   		top.toastr.error('请上传apk文件');
					    return ;
				   }
				}
				if($("#appVersionForm").data("bootstrapValidator").isValid()) {
						$("#appVersionForm").ajaxSubmit({
							url : "system/sys/AppVersionController/saveAppVersion.action",
							type : "post",
							dataType : "json",
							success : function(data) {
							debugger;
								if(data.execute) {
									top.toastr.success(data.msg);
									//closeParentLayer();
									parent.layer.closeAll('iframe');
								} else {
									if(data.data) {
										var fieldName = data.data;
										$("#appVersionForm").bootstrapValidator("addField", fieldName, {
											validators: {
												customValid: {
													message: data.msg,
													oldValue: $("#appVersionForm")[0][fieldName].value
												}
											}
										});
										$("#appVersionForm").data("bootstrapValidator").validateField(fieldName);
									} else {
										top.toastr.error(data.msg);
									}
								}
							}
							
						});
					
				
				}
			}
			
			function closeLayer(){
			    parent.layer.closeAll('iframe');
			}
			
			
			$(document).ready(function() {
				formValidatorInit();
			});
		
	 


  </script>
  <body>
     <div class="bootstrap-form">
			<form role="form"  class="form-horizontal" id="appVersionForm" method="post" enctype="multipart/form-data">
				<div class="form-group">
					<label class="control-label col-xs-3 form-lable">更新类型：</label>
					<div class="col-xs-9">
								<select class="form-control" name="is_update">
								<option value="" >请选择</option>
									<option value="1">强制更新</option>
									<option value="0">非强制更新</option>
								</select>
							</div>
				</div>
				<div class="form-group">
					<label class="control-label col-xs-3 form-lable" >版本名称：</label>
					<div class="col-xs-9">
						<input type="text" class="form-control" name="v_name" >
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-xs-3 form-lable" >版本编号：</label>
					<div class="col-xs-9">
						<input type="text" class="form-control" name="v_code" placeholder="版本格式如 ：x.xx.xxx">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-xs-3 form-lable" >版本文件：</label>
					<div class="col-xs-9">
						 <input type="file" id="file"  name="file">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-xs-3 form-lable" >版本备注：</label>
					<div class="col-xs-9" style="margin-bottom: 10px;">
						<textarea rows="3" cols="30" class="form-control" name="bz" style="height: 70px;"></textarea>
					</div>
				</div>
				<div class="form-group form-group-button">
					<span class="col-xs-4"></span>
					<div class="col-xs-2">
						<button type="button" onclick="submitForm()" class="btn btn-primary btn-sm">保存</button>
					</div>
					<div class="col-xs-2">
						<button type="button" onclick="closeLayer()" class="btn btn-primary btn-sm">取消</button>
					</div>
					<span class="col-xs-4"></span> 
				</div>
			</form>
		</div>
  </body>
</html>