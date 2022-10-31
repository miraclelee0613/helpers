<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="shortcut icon"
      type="image/x-icon"
      href="${pageContext.request.contextPath}/assets/images/admin/customer-service.png"
    />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/qna.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin/interface.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&family=Noto+Sans+KR&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css"
    />
    <title>Helpers AdminPage</title>
  </head>
  <body>
    <div class="body-wrap">
      <!-- 메뉴 헤더 시작 -->
      <div class="menu-wrap">
        <div class="menu-header pointer">
          <div class="menu-header-name">
            <h3><i>Hel</i><i style="color: white">pers</i></h3>
          </div>
        </div>
        <!-- 메뉴 카테고리 시작 -->
        <div class="menu-body">
          <ul class="site-visit">
            <li class="pointer">
              <span>Helpers</span>
            </li>
            <a href="${pageContext.request.contextPath}/index/index.in" style="color: #E0ECF8">
              <li class="pointer">
              	<span>사이트 바로가기</span>  
           	  </li>
            </a>
          </ul>
          <ul class="category">
            <a href="${pageContext.request.contextPath}/admin/index.admin">
              <li class="pointer">
                <span>관리자 홈</span>
              </li>
            </a>
            <a href="${pageContext.request.contextPath}/admin/post.admin">
            <li class="pointer">
              <span>도움 요청</span>
            </li>
            </a>
            <a href="${pageContext.request.contextPath}/admin/userlist.admin">
              <li class="pointer">
                <span>회 원</span>
              </li>
            </a>
            <a href="${pageContext.request.contextPath}/admin/certificate.admin">
              <li class="pointer">
                <span>증명서</span>
              </li>
            </a>
            <a href="${pageContext.request.contextPath}/admin/qna.admin">
              <li class="pointer select">
                <span>문 의</span>
                <img src="${pageContext.request.contextPath}/assets/images/admin/next.png" />
              </li>
            </a>
          </ul>
        </div>
      </div>

      <div class="dummy"></div>

      <div class="content-wrap">
        <!-- 컨텐츠 헤더 -->
        <div class="content-header">
          <!-- 컨텐츠 주제 -->
          <div class="content-name">
            <img src="${pageContext.request.contextPath}/assets/images/admin/email.png" />
            <h3>Helpers 문의 목록</h3>
          </div>
          <!-- 오늘의 통계 -->
          <div class="today-box">
            <div class="today-count">
              <img src="${pageContext.request.contextPath}/assets/images/admin/open-bracket.png" />
              <p>오늘의 방문자<br />42</p>
              <img src="${pageContext.request.contextPath}/assets/images/admin/close-bracket.png" />
            </div>
            <div class="today-count">
              <img src="${pageContext.request.contextPath}/assets/images/admin/open-bracket.png" />
              <p>오늘의 회원가입<br />31</p>
              <img src="${pageContext.request.contextPath}/assets/images/admin/close-bracket.png" />
            </div>
            <div class="today-count">
              <img src="${pageContext.request.contextPath}/assets/images/admin/open-bracket.png" />
              <p>오늘의 도움 요청<br />28</p>
              <img src="${pageContext.request.contextPath}/assets/images/admin/close-bracket.png" />
            </div>
            <div class="today-count">
              <img src="${pageContext.request.contextPath}/assets/images/admin/open-bracket.png" />
              <p>오늘의 문의<br />24</p>
              <img src="${pageContext.request.contextPath}/assets/images/admin/close-bracket.png" />
            </div>
          </div>
          <!-- 프로필 사진 로그아웃 -->
          <div class="content-header-profile">
            <div class="profile-box pointer">
              <img src="${pageContext.request.contextPath}/assets/images/admin/bukbuk.png" />
              <span>벅벅코딩</span>
            </div>
            <button class="logout pointer">Logout</button>
          </div>
        </div>
        <!-- 컨텐츠 시작 -->
        <!-- 컨텐츠 시작 -->
        <div class="content-body">
          <div class="request-wrap">
            <!-- 제목 -->
            <div class="title-box">
              <h2>문의 목록</h2>
              <p>12+</p>
            </div>
            <div class="request-box">
              <!-- 테이블 -->
              <table class="type03">
                <thead>
                  <tr>
                    <th scope="cols" class="total-name">
                      <label for="total--name"
                        ><input type="checkbox" id="total--name" /> 이 름
                      </label>
                    </th>
                    <th scope="cols">아이디</th>
                    <th scope="cols">제 목</th>
                    <th scope="cols">전화 번호</th>
                    <th scope="cols">이메일</th>
                    <th scope="cols">
                      삭 제
                      &nbsp&nbsp&nbsp
                      <img
                        class="delete pointer"
                        src="${pageContext.request.contextPath}/assets/images/admin/delete.png"
                        alt="삭제"
                      />
                    </th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">
                      <label for="name1"
                        ><input type="checkbox" id="name1" name="dl-btn" />
                        문성준</label
                      >
                    </th>
                    <td>msj1</td>
                    <td class="request-select">
                      <a href="#modal1" rel="modal:open">메일 문의가 안되요.</a>
                    </td>
                    <td>010-1111-1111</td>
                    <td>msj1@gmail.com</td>
                    <td><button class="secession">삭제</button></td>
                  </tr>
                </tbody>
              </table>
              <!-- 모달창 -->
              <div id="modal1" class="modal">
                <div class="modal-mail">
                  <div class="modal-mail-title">
                    <h3>제목 : 메일 문의가 안되요.</h3>
                  </div>
                  <div class="modal-mail-content">
                    <span
                      >메일 문의가 안되요. 메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요 메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요 메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요 메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요 메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요메일 문의가 안되요메일 문의가 안되요메일 문의가
                      안되요
                    </span>
                  </div>
                </div>
              </div>
              <!-- 페이지 버튼 -->
            </div>
            <div class="page-btn">
              <button class="img-btn">
                <img src="${pageContext.request.contextPath}/assets/images/admin/prevPage-btn1.png" alt="prevPage" />
              </button>
              <button class="img-btn">
                <img src="${pageContext.request.contextPath}/assets/images/admin/prev-btn.png" alt="prev" />
              </button>
              <button class="move-btn">1</button>
              <button class="move-btn">2</button>
              <button class="move-btn">3</button>
              <button class="move-btn">4</button>
              <button class="move-btn">5</button>
              <button class="move-btn">6</button>
              <button class="move-btn">7</button>
              <button class="move-btn">8</button>
              <button class="move-btn">9</button>
              <button class="move-btn">10</button>
              <button class="img-btn">
                <img src="${pageContext.request.contextPath}/assets/images/admin/next-btn.png" alt="next" />
              </button>
              <button class="img-btn">
                <img src="${pageContext.request.contextPath}/assets/images/admin/nextpage-btn.png" alt="nextPage" />
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
  <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
  <script>
    $(document).ready(function () {
      $("#total--name").click(function () {
        if ($("#total--name").is(":checked"))
          $("input[name=dl-btn]").prop("checked", true);
        else $("input[name=dl-btn]").prop("checked", false);
      });

      $("input[name=dl-btn]").click(function () {
        var total = $("input[name=dl-btn]").length;
        var checked = $("input[name=dl-btn]:checked").length;

        if (total != checked) $("#total--name").prop("checked", false);
        else $("#total--name").prop("checked", true);
      });
    });
  </script>
</html>
