DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  phone VARCHAR(250) NOT NULL
);

INSERT INTO user (name, email, phone) VALUES
  ('Aliko', 'Aliko@gmail.com', '0912345678'),
  ('Bill', 'Bill@gmail.com', '0987654321'),
  ('Folrunsho', 'Folrunsho@gmail.com', '0911223344');