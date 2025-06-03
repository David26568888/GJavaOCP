use mydb;
create table if not exists users(
	id int auto_increment primary key, -- id序號
    username varchar(50) unique not null, -- 名稱(拒絕空值)
    gender enum('M', 'F'), -- 性別 enum限制只能用陣列內的值
    birthday date, -- 生日
    interests varchar(255), -- 興趣 預設255字元(我們不設定值) 最大8000
    self_intro varchar(255), -- 自我介紹
    appearance varchar(255) -- 外觀描述
);