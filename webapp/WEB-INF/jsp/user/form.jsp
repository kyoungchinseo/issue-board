<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/tags.jspf"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/include/head.jspf"%>
</head>
<body>
	<div class="issues issues--wrap mdl-layout mdl-js-layout has-drawer is-upgraded">
		<%@ include file="/WEB-INF/include/navigation.jspf" %>
		<main class="mdl-layout__content">
		<div class="issues__posts mdl-layout-form ">
			<div class="mdl-card mdl-shadow--2dp">
		
				<div class="mdl-card__title mdl-color--primary mdl-color-text--white">
						<h3 class="mdl-card__title-text">Create Your Account</h3>
				</div>
			
				<div class="mdl-card__supporting-text">
				
					<form:form name="user" modelAttribute="user" action="/users/new" method="post">
						<div class="mdl-layout-form__content mdl-textfield mdl-js-textfield">
							<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
								<form:input cssClass="mdl-textfield__input" type="text" path="userId" /> 
								<label class="mdl-textfield__label" for="userId">Username</label>
							</div>
							<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
								<form:input cssClass="mdl-textfield__input" type="text" path="password" /> 
								<label class="mdl-textfield__label" for="password">Password</label>
							</div>
							<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
								<form:input cssClass="mdl-textfield__input" type="text" path="name" /> 
								<label class="mdl-textfield__label" for="name">Name</label>
							</div>
							<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
								<form:input cssClass="mdl-textfield__input" type="text" path="githubId" /> 
								<label class="mdl-textfield__label" for="githubId">GitHub ID</label>
							</div>
							<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
								<form:input cssClass="mdl-textfield__input" type="text" path="email" /> 
								<label class="mdl-textfield__label" for="email">Email</label>
							</div>
						</div>
						<div class="mdl-card__actions">
							<button type="submit" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">Create</button>
							<button type="cancel" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">Cancel</button>
						</div>
			        </form:form>
		        </div>
        	</div>
        </div>
		</main>
		<%@ include file="/WEB-INF/include/footer.jspf"%>
		
		<div class="mdl-layout__obfuscator"></div>
	</div>
	<script src="https://code.getmdl.io/1.1.3/material.min.js"></script>
</body>
</html>
