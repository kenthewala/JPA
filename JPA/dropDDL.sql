ALTER TABLE CENTRE DROP CONSTRAINT FK_CENTRE_centreHead_id
ALTER TABLE STUDENT DROP CONSTRAINT FK_STUDENT_centre_id
ALTER TABLE QUESTION DROP CONSTRAINT FK_QUESTION_correctAnswer_id
ALTER TABLE QUESTION DROP CONSTRAINT FK_QUESTION_subject_id
ALTER TABLE centre_subjects DROP CONSTRAINT FK_centre_subjects_centre_id
ALTER TABLE centre_subjects DROP CONSTRAINT FK_centre_subjects_subject_id
ALTER TABLE centre_examination DROP CONSTRAINT FK_centre_examination_centre_id
ALTER TABLE centre_examination DROP CONSTRAINT FK_centre_examination_exam_id
ALTER TABLE exam_question DROP CONSTRAINT FK_exam_question_exam_id
ALTER TABLE exam_question DROP CONSTRAINT FK_exam_question_question_id
ALTER TABLE question_choices DROP CONSTRAINT FK_question_choices_question_id
ALTER TABLE question_choices DROP CONSTRAINT FK_question_choices_answer_choice
DROP TABLE CENTRE CASCADE
DROP TABLE STUDENT CASCADE
DROP TABLE CENTREHEAD CASCADE
DROP TABLE EXAMINATION CASCADE
DROP TABLE QUESTION CASCADE
DROP TABLE ANSWER CASCADE
DROP TABLE SUBJECT CASCADE
DROP TABLE centre_subjects CASCADE
DROP TABLE centre_examination CASCADE
DROP TABLE exam_question CASCADE
DROP TABLE question_choices CASCADE
