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
		
		<div class="issues__posts mdl-grid">
			<div class="mdl-card mdl-shadow--4dp mdl-cell mdl-cell--12-col">
				<div class="mdl-card__menu">
					<button
						class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
						<i class="material-icons">edit</i>
					</button>
					<button id="issues-menu-lower-right"
						class="mdl-button mdl-js-button mdl-button--icon">
						<i class="material-icons">more_vert</i>
					</button>
					<ul
						class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect mdl-color-text--grey-700"
						for="issues-menu-lower-right">
						<li class="mdl-menu__item--full-bleed-divider"><strong>Labels</strong></li>
						<li class="mdl-menu__item">enhancement</li>
						<li class="mdl-menu__item--full-bleed-divider"><strong>Milestone</strong></li>
						<li class="mdl-menu__item">No milestone</li>
						<li class="mdl-menu__item--full-bleed-divider"><strong>Assignee</strong></li>
						<li class="mdl-menu__item">javajigi</li>
					</ul>
				</div>
				<div class="mdl-card__title mdl-color-text--grey-50">
					<i class="material-icons">check_circle</i>
					<h2 class="mdl-card__title-text">spring boot 기반 개발이 가능하도록 한다.
						#227</h2>
				</div>
				<div class="mdl-color-text--grey-700 mdl-card__supporting-text meta">
					<a href="https://github.com/javajigi"> <img class="minilogo"
						height="48" width="48"
						src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
						alt="@javajigi">
					</a>
					<div>
						<div class="author-text">
							<strong> <a href="https://github.com/javajigi"
								class="author">javajigi</a>
							</strong>
						</div>
						<span>11 Aug 2015</span>
					</div>
					<div class="section-spacer"></div>
					<button
						class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
						<i class="material-icons" role="presentation">thumb_up</i><span
							class="visuallyhidden">like comment</span>
					</button>
					<button
						class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
						<i class="material-icons" role="presentation">thumb_down</i><span
							class="visuallyhidden">dislike comment</span>
					</button>
				</div>
				<div class="mdl-color-text--grey-700 mdl-card__supporting-text">
					<p>
						현재 모든 설정 파일도 java config 기반으로 변경했다.<br>spring boot 기반으로 설정을
						변경하는 것도 가능하겠다.
					</p>
				</div>
				<div
					class="mdl-color-text--primary-contrast mdl-card__supporting-text comments">
					<!-- comments start -->
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar2" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
								<span>added the enhancement label on 11 Aug 2015</span>
							</strong>
						</div>
						</header>
					</div>
					<hr>
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar2" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
								<span>self-assigned this on 11 Aug 2015</span>
							</strong>
						</div>
						</header>
					</div>
					<hr>
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar2" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
								<span>added this to the 반복주기 15 milestone on 11 Aug 2015</span>
							</strong>
						</div>
						</header>
					</div>
					<hr>
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
							</strong> <span>11 Aug 2015</span>
						</div>
						<nav class="comment__actions">
						<button
							class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
							<i class="material-icons" role="presentation">thumb_up</i><span
								class="visuallyhidden">like comment</span>
						</button>
						<button
							class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
							<i class="material-icons" role="presentation">thumb_down</i><span
								class="visuallyhidden">dislike comment</span>
						</button>
						</nav> </header>
						<div class="comment__text">
							<span>모든 소스 코드를 scala 기반으로 변경한 후에 진행하는 것이 좋을 수도 있겠다.</span>
						</div>
					</div>
					<hr>
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar2" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
								<span>removed this from the 반복주기 15 milestone on 11 Aug
									2015</span>
							</strong>
						</div>
						</header>
					</div>
					<hr>
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
							</strong> <span>17 Dec 2015</span>
						</div>
						<nav class="comment__actions">
						<button
							class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
							<i class="material-icons" role="presentation">thumb_up</i><span
								class="visuallyhidden">like comment</span>
						</button>
						<button
							class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
							<i class="material-icons" role="presentation">thumb_down</i><span
								class="visuallyhidden">dislike comment</span>
						</button>
						</nav> </header>
						<div class="comment__text">
							<span>시도했으나 과정이 너무 복잡함. 이후에 다시 진행하는 것이 좋겠음.</span>
						</div>
					</div>
					<hr>
					<div class="comment mdl-color-text--grey-700">
						<header class="comment__header"> <img
							class="comment__avatar2" height="48" width="48"
							src="https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96"
							alt="@javajigi">
						<div class="comment__author">
							<strong> <a href="/javajigi" class="author">javajigi</a>
								<span>closed this on 17 Dec 2015</span>
							</strong>
						</div>
						</header>
					</div>
					<!-- comments end -->
				</div>
				<div
					class="mdl-color-text--primary-contrast mdl-card__supporting-text new-comment">
					<form>
						<div
							class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
							<textarea rows=5 class="mdl-textfield__input" id="comment"></textarea>
							<label for="comment" class="mdl-textfield__label">Leave a
								comment</label>
						</div>
						<button
							class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
							<i class="material-icons" role="presentation">check</i><span
								class="visuallyhidden">add comment</span>
						</button>
					</form>
				</div>
			</div>
		</div>
		<%@ include file="/WEB-INF/include/footer.jspf"%>
		</footer> 
		</main>
		<div class="mdl-layout__obfuscator"></div>
	</div>
	<script src="https://code.getmdl.io/1.1.3/material.min.js"></script>
</body>
</html>
