INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (1, 'lee', '123', '석준', 'robin00q@anaver.com', CURRENT_TIMESTAMP());
INSERT INTO USER (ID, USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES (2, 'leesj', '123', '석준', 'robin00q@anaver.com', CURRENT_TIMESTAMP());

INSERT INTO QUESTION (id, writer_id, title, contents, create_date, count_of_answer) VALUES (1, 1, '질문', '내용', CURRENT_TIMESTAMP(), 0)
