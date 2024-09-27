/***** [ 테이블 ] *****/

CREATE TABLE CUSTOMER(

CUSTOMER_NO NUMBER PRIMARY KEY,

CUSTOMER_NAME VARCHAR2(60) NOT NULL,

CUSTOMER_TEL VARCHAR2(30) NOT NULL,

CUSTOMER_ADDRESS VARCHAR2(200) NOT NULL

);

/***** [ 시퀀스 ] *****/

CREATE SEQUENCE SEQ_CUSTOMER_NO NOCACHE;


SELECT *
FROM CUSTOMER



