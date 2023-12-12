DROP TABLE IF EXISTS `TB_USER`;

CREATE TABLE `TB_USER` (
	`USER_ID`	BIGINT	NOT NULL	COMMENT '사용자ID',
	`USER_NAME`	VARCHAR(20)	NOT NULL	COMMENT '이름',
	`PHONE`	VARCHAR(20)	NOT NULL	COMMENT '핸드폰 번호',
	`PASSWORD`	VARCHAR(100)	NOT NULL	COMMENT '로그인 비밀번호',
	`USER_TYPE`	VARCHAR(10)	NOT NULL	COMMENT '사용자타입코드',
	`CREATED_TIME`	TIMESTAMP(6)	NOT NULL	COMMENT '등록일시'
);

DROP TABLE IF EXISTS `ENUM_USER_TYPE`;

CREATE TABLE `ENUM_USER_TYPE` (
	`USER_TYPE`	VARCHAR(10)	NOT NULL	COMMENT '사용자타입코드',
	`TYPE_NAME`	VARCHAR(10)	NOT NULL	COMMENT '사용자타입명'
);

DROP TABLE IF EXISTS `TB_CHANNEL`;

CREATE TABLE `TB_CHANNEL` (
	`CHANNEL_ID`	BIGINT	NOT NULL	COMMENT '채널ID',
	`USER_ID`	BIGINT	NOT NULL	COMMENT '사용자ID',
	`CHANNEL_NAME`	VARCHAR(20)	NOT NULL	COMMENT '채널명',
	`CONTENTS`	VARCHAR(400)	NOT NULL	COMMENT '채널설명',
	`APPROVAL_STATE`	VARCHAR(10)	NOT NULL	COMMENT '채널상태ID',
	`CREATED_TIME`	TIMESTAMP(6)	NOT NULL	COMMENT '등록일시'
);

DROP TABLE IF EXISTS `ENUM_APPROVAL_STATE`;

CREATE TABLE `ENUM_APPROVAL_STATE` (
	`APPROVAL_STATE`	VARCHAR(10)	NOT NULL	COMMENT '채널상태ID',
	`STATE_NAME`	VARCHAR(10)	NOT NULL	COMMENT '채널상태명'
);

DROP TABLE IF EXISTS `TB_PARTICIPATION`;

CREATE TABLE `TB_PARTICIPATION` (
	`PARTICIPATION_ID`	BIGINT	NOT NULL	COMMENT '참여ID',
	`CHANNEL_ID`	BIGINT	NOT NULL	COMMENT '채널ID',
	`USER_ID`	BIGINT	NOT NULL	COMMENT '사용자ID',
	`CREATED_TIME`	TIMESTAMP(6)	NOT NULL	COMMENT '등록일시'
);

DROP TABLE IF EXISTS `TB_RESERVATION`;

CREATE TABLE `TB_RESERVATION` (
	`RESV_ID`	BIGINT	NOT NULL	COMMENT '예약ID',
	`USER_ID`	BIGINT	NOT NULL	COMMENT '사용자ID',
	`ACTIVITY_ID`	BIGINT	NOT NULL	COMMENT '활동ID',
	`CREATED_TIME`	TIMESTAMP(6)	NOT NULL	COMMENT '등록일시'
);

DROP TABLE IF EXISTS `TB_ACTIVITY`;

CREATE TABLE `TB_ACTIVITY` (
	`ACTIVITY_ID`	BIGINT	NOT NULL	COMMENT '활동ID',
	`CHANNEL_ID`	BIGINT	NOT NULL	COMMENT '채널ID',
	`DATE`	CHAR(8)	NOT NULL	COMMENT '년월일',
	`TIME`	CHAR(4)	NOT NULL	DEFAULT '0000'	COMMENT '시분',
	`CAPACITY`	TINYINT	NOT NULL	DEFAULT 1	COMMENT '수용인원',
	`DURATION`	TINYINt	NOT NULL	DEFAULT 60	COMMENT '진행시간',
	`CREATED_TIME`	TIMESTAMP(6)	NOT NULL	COMMENT '등록일시'
);

ALTER TABLE `TB_USER` ADD CONSTRAINT `PK_TB_USER` PRIMARY KEY (
	`USER_ID`
);

ALTER TABLE `ENUM_USER_TYPE` ADD CONSTRAINT `PK_ENUM_USER_TYPE` PRIMARY KEY (
	`USER_TYPE`
);

ALTER TABLE `TB_CHANNEL` ADD CONSTRAINT `PK_TB_CHANNEL` PRIMARY KEY (
	`CHANNEL_ID`
);

ALTER TABLE `ENUM_APPROVAL_STATE` ADD CONSTRAINT `PK_ENUM_APPROVAL_STATE` PRIMARY KEY (
	`APPROVAL_STATE`
);

ALTER TABLE `TB_PARTICIPATION` ADD CONSTRAINT `PK_TB_PARTICIPATION` PRIMARY KEY (
	`PARTICIPATION_ID`
);

ALTER TABLE `TB_RESERVATION` ADD CONSTRAINT `PK_TB_RESERVATION` PRIMARY KEY (
	`RESV_ID`
);

ALTER TABLE `TB_ACTIVITY` ADD CONSTRAINT `PK_TB_ACTIVITY` PRIMARY KEY (
	`ACTIVITY_ID`
);
