create database db_educativa;
use db_educativa;
drop database db_educativa;

/*Script Tabela Aluno*/
create table tb_aluno(
	idAluno int auto_increment not null primary key,
    nomeAluno varchar(50) not null,
    cpfAluno char(11) not null,
    emailAluno varchar(50) not null,
    idadeAluno int not null,
    senhaAluno char(15)
);
insert into tb_aluno (nomeAluno, cpfAluno, emailAluno, idadeAluno, senhaAluno) VALUES ('Adriel', '11111111111', 'adriel@gmail.com', 18, '1234');
insert into tb_aluno (nomeAluno, cpfAluno, emailAluno, idadeAluno, senhaAluno) VALUES ('Guilherme', '22222222222', 'guilherme@gmail.com', 18, '4321');
select * from tb_aluno;
/*-----------------------*/




/*Script Tabela Professor*/
create table tb_professor(
	idProfessor int auto_increment not null primary key,
	nomeProfessor varchar(50) not null,
    cpfProfessor char(11) not null,
    emailProfessor varchar(50) not null,
    formacaoProfessor varchar(50) not null,
    escolaridadeProfessor varchar(50) not null,
    senhaProfessor char(15) not null
);
insert into tb_professor (nomeProfessor, cpfProfessor, emailProfessor, formacaoProfessor, escolaridadeProfessor, senhaProfessor) VALUES ('Endildo', '333333333', 'enildo@gmail.com', 'ADS', 'tecnologo', '1234');
select * from tb_professor;
/*------------------------*/



/*Script Tabela Curso*/
create table tb_curso(
	idCurso int auto_increment not null primary key,
    tituloCurso varchar(50) not null,
    descCurso varchar(1000) not null,
    duracaoCurso int not null,
    categoriaCurso varchar(50) not null,
    areaEnsinoCurso varchar(20),
    certificado boolean not null,
    avaliacao boolean not null
);
insert into tb_curso (tituloCurso, descCurso, duracaoCurso, categoriaCurso, areaEnsinoCurso, certificado, avaliacao) VALUES ('JAVASCRIPT', 'muito legal esse curso', 40, 'Programação', 'front-end', true, true);
insert into tb_curso (tituloCurso, descCurso, duracaoCurso, categoriaCurso, areaEnsinoCurso, certificado, avaliacao) VALUES ('JAVA', 'muito chato esse curso', 80, 'Programação', 'back-end', true, true);
insert into tb_curso (tituloCurso, descCurso, duracaoCurso, categoriaCurso, areaEnsinoCurso, certificado, avaliacao) VALUES ('MYSQL', 'curso introdução ao mysql', 30, 'Programação', 'banco de dados', true, true);
select * from tb_curso;
/*------------------------------*/







/*Script Tabela Documento*/
create table tb_documento(
	idDocumento int auto_increment not null primary key,
    tituloDocumento varchar(50) not null,
    linkDocumento varchar(300) not null
);
select * from tb_documento;
/*-------------------------*/




/*Script Tabelas Adicionais
create table tb_curso_documento(
	id_curso int,
    id_documento int,
    primary key (id_curso, id_documento),
    foreign key (id_curso) references tb_curso(idCurso),
    foreign key (id_documento) references tb_documento(idDocumento)
);

create table tb_curso_aluno(
	id_curso int, 
    id_aluno int, 
    primary key (id_curso, id_aluno),
    foreign key (id_curso) references tb_curso(idCurso),
    foreign key (id_aluno) references tb_aluno(idAluno)
);

insert into tb_curso_aluno (id_curso, id_aluno) VALUES (2, 1);
insert into tb_curso_aluno (id_curso, id_aluno) VALUES (1, 2);
select * from tb_curso_aluno;

select tituloCurso from tb_curso inner join tb_curso_aluno on tb_curso.idCurso = tb_curso_aluno.id_curso where tb_curso_aluno.id_aluno = 1;

select nomeAluno from tb_Aluno inner join tb_curso_aluno on tb_aluno.idAluno = tb_curso_aluno.id_aluno where tb_curso_aluno.id_curso = 2;

SELECT COUNT(*) FROM tb_aluno;
-----------------*/


















select nomeAluno from tb_aluno where idAluno=7;
