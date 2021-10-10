create table if not EXISTS Users(
	id serial not null primary key,
	nickname varchar(20) not null,
	rol varchar(10) not null
);



create table if not exists Administrators(
	id serial not null primary key,
	nickname varchar(20) not null,
	mail varchar(40) not null,
	rol varchar(10) not null,
	passwd varchar(15) not null
);

create table if not exists Creators(
	id serial not null primary key,
	nickname varchar(20) not null,
	mail varchar(40) not null,
	rol varchar(10) not null,
	passwd varchar(15) not null
);

create table if not exists Players(
	id serial not null primary key,
	nickname varchar(20) not null,
	rol varchar(10) not null,
	totalScore int not null
);
create table if not exists Rooms(
	code serial not null primary key,
	name varchar(20) not null,
	money int not null,
	bank int not null,
	idCreator int not null,
	time int not null
);

create table if not exists Rounds(
	number int not null,
	codeRoom int not null,
	eliminatedPlayer int,
	primary key(number, codeRoom)
	
);

create table if not exists Joins(
	idPlayer int not null,
	codeRoom int not null,
	primary key(idPlayer, codeRoom)
);

create table if not exists Questions(
	id serial not null primary key,
	topic varchar(15) not null,
	question varchar(100) not null
	
);
create table if not exists Answers(
	idQuestion int not null,
	idPlayer int not null,
	correctAnswer boolean not null,
	primary key(idQuestion, idPlayer)
);

create table if not exists Options(
	
	id serial not null primary key,
	idQuestion int not null,
	option varchar(100) not null,
	correct boolean not null
);

create table if not exists Topics(
	name varchar(15) not null primary key
	
);

create table if not exists Handle(
	codeRoom int not null,
	topic varchar(15) not null,
	primary key(codeRoom, topic)
);

create table if not exists Roles(
	rol varchar(10) not null primary key 
);

alter table Users add constraint uk_users unique (nickname);  

alter table administrators add constraint uk_administrator unique (mail);

alter table creators add constraint uk_creators unique (mail);

alter table topics add constraint uk_topics unique (name);



alter table players add constraint fk_id_Player_Users 
foreign key (id) references Users (id);

alter table creators add constraint fk_id_Creator_Users 
foreign key (id) references Users (id);

alter table administrators add constraint fk_id_Administrator_Users 
foreign key (id) references Users (id);


alter table players add constraint fk_nick_Player_Users 
foreign key (nickname) references Users (nickname);

alter table creators add constraint fk_nick_Creator_Users 
foreign key (nickname) references Users (nickname);

alter table administrators add constraint fk_nick_Administrator_Users 
foreign key (nickname) references Users (nickname);



alter table users add constraint fk_rol_Users_Role 
foreign key (rol) references roles (rol);


alter table players add constraint fk_rol_Player_Users 
foreign key (rol) references Users (rol);

alter table creators add constraint fk_rol_Creator_Users 
foreign key (rol) references Users (rol);

alter table administrators add constraint fk_rol_Administrator_Users 
foreign key (rol) references Users (rol);



alter table rooms add constraint fk_rooms_creators
foreign key(idcreator) references creators (id);

alter table rounds add constraint fk_rounds_rooms
foreign key (coderoom) references rooms (code);

alter table joins add constraint fk_joins_players
foreign key (idPlayer) references players (id);

alter table joins add constraint fk_joins_rooms
foreign key (codeRoom) references rooms (code);

alter table handle add constraint fk_handle_topic
foreign key (topic) references topics (name);

alter table handle add constraint fk_handle_rooms
foreign key (codeRoom) references rooms (code);

alter table answers add constraint fk_answers_questions 
foreign key (idQuestion) references questions (id);

alter table answers add constraint fk_answers_players
foreign key (idplayer) references players (id);

alter table options add constraint fk_options_questions
foreign key (idquestion) references questions (id);

alter table questions add constraint fk_questions_topics
foreign key (topic) references topics (name);


drop table administrators cascade;
drop table answers cascade;
drop table creators cascade;
drop table handle cascade;
drop table joins cascade;
drop table options cascade;
drop table players cascade;
drop table questions cascade; 
drop table roles cascade; 
drop table rooms cascade; 
drop table rounds cascade; 
drop table topics cascade; 
drop table users cascade; 