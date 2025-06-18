-- Active: 1749604230285@@127.0.0.1@3306@jdbc_board
-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board (
  no INTEGER AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  writer VARCHAR(100) NOT NULL,
  content TEXT,
  reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, -- 기본값으로 현재 시간을 넣음
  -- DATE 타입: reg_date DATE NOT NULL DEFAULT CURRENT_DATE 
  upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  -- ON UPDATE CURRENT_TIMESTAMP: UPDATE 시 자동으로 수정 시간도 갱신
  PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUES ('게시글 제목1', '김재', '집에 가고 싶다.');

-- 조회
SELECT * FROM board;
SELECT * FROM board WHERE no = 1;

-- 수정
UPDATE board
SET
  title = '게시글 제목 수정',
  writer = '재현',
  content = '나 먼저감'
  -- upd_date = now() -- 수정일을 현재 시간으로 갱신
WHERE no = 1;

-- 삭제
DELETE FROM board WHERE no = 1;

-- 추가 2
INSERT INTO board (title, writer, content)
VALUES
  ('게시글1', '김재1', '집에 가고 싶다.1'), 
  ('게시글2', '김재2', '집에 가고 싶다.2'), 
  ('게시글3', '김재3', '집에 가고 싶다.3');

-- 수정 2
UPDATE board
SET content = '집가서 뭐하지'
WHERE no = 2;

UPDATE board SET title = '게시글 제목 수정', writer = '재현', content = '나 먼저감' WHERE no = 1;  

-- 댓글 테이블
CREATE TABLE comment (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  board_no INTEGER NOT NULL,
  commenter VARCHAR(50),
  comment TEXT,
  reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (board_no) REFERENCES board(no) ON DELETE CASCADE
  -- ON DELETE CASCADE: 외래키(FK)에 설정하는 옵션으로
  -- 부모 테이블의 행이 삭제될 때, 해당 행을 참조하는 자식 테이블의 행들도 자동으로 삭제
  -- 예: board의 특정 게시글이 삭제되면 그 게시글에 달린 comment들도 자동으로 삭제
);
