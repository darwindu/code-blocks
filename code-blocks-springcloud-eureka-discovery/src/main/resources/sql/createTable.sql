DROP TABLE IF EXISTS payment;
CREATE TABLE payment (
  id bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  serial varchar(255) DEFAULT '' COMMENT '流水号',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of payment
-- ----------------------------
BEGIN;
INSERT INTO payment VALUES (1, 'No.1');
INSERT INTO payment VALUES (2, 'No.2');
INSERT INTO payment VALUES (3, 'No.3');
COMMIT;