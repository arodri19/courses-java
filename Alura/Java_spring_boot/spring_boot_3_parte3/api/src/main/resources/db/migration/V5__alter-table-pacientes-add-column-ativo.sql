ALTER TABLE pacientes ADD COLUMN ativo tinyint;
UPDATE pacientes SET ativo = 1;
ALTER TABLE pacientes modify ativo tinyint NOT NULL;