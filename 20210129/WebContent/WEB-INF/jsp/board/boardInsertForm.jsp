<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../main/menu.jsp" />

<!-- Page content -->
<div class="w3-content" style="max-width: 2000px; margin-top: 46px"
	align="center">
	<div align="center">
		<h1>게시글 작성</h1>
		<div>
			<form id="frm" name="frm" action="boardInsert.do" method="post">
				<table border="1">
					<tr>
						<th width="100">작성자</th>
						<td align="center" width="100"><input type="text" id="bName"
							name="bName" required="required"></td>
						<th width="100">작성일자</th>
						<td align="center" width="100"><input type="date" id="bDate"
							name="bDate" required="required"></td>
					</tr>
					<tr>
						<th width="50">제 목</th>
						<td colspan="5"><input type="text" id="bTitle" name="bTitle"
							size="75" required="required"></td>
					</tr>
					<tr>
						<th width="50">내용</th>
						<td colspan="5"><textarea id="bContent" name="bContent"
								rows="7" cols="70" required="required"></textarea></td>
					</tr>
				</table>
				<br />
				<div>
					<button type="submit">저장하기</button>
					&nbsp;&nbsp;
					<button type="reset">취소</button>
					&nbsp;&nbsp;
					<button type="button" onclick="location.href='boardList.do'">목록</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>