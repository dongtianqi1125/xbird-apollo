## ApolloConfigDB
INSERT INTO apolloconfigdb.`ServerConfig` (`Key`, `Cluster`, `Value`, `Comment`)
VALUES
    ('eureka.service.url', 'default', 'http://localhost:8080/eureka/', 'Eureka����Url�����service��Ӣ�Ķ��ŷָ�'),
    ('namespace.lock.switch', 'default', 'false', 'һ�η���ֻ����һ�����޸Ŀ���'),
    ('item.key.length.limit', 'default', '128', 'item key ��󳤶�����'),
    ('item.value.length.limit', 'default', '20000', 'item value��󳤶�����'),
    ('config-service.cache.enabled', 'default', 'false', 'ConfigService�Ƿ������棬��������������ܣ����ǻ������ڴ����ģ�');

## ApolloPortalDB
INSERT INTO apolloportaldb.`ServerConfig` (`Key`, `Value`, `Comment`)
VALUES
    ('apollo.portal.envs', 'dev', '��֧�ֵĻ����б�'),
    ('organizations', '[{\"orgId\":\"TEST1\",\"orgName\":\"��������1\"},{\"orgId\":\"TEST2\",\"orgName\":\"��������2\"}]', '�����б�'),
    ('superAdmin', 'apollo', 'Portal��������Ա'),
    ('api.readTimeout', '10000', 'http�ӿ�read timeout'),
    ('consumer.token.salt', 'someSalt', 'consumer token salt'),
    ('admin.createPrivateNamespace.switch', 'false', '�Ƿ�������Ŀ����Ա����˽��namespace');
INSERT INTO apolloportaldb.`Users` (`Username`, `Password`, `Email`, `Enabled`)
VALUES
	('apollo', '$2a$10$7r20uS.BQ9uBpf3Baj3uQOZvMVvB1RN3PYoKE94gtz2.WAOuiiwXS', 'apollo@acme.com', 1);
INSERT INTO apolloportaldb.`Authorities` (`Username`, `Authority`) VALUES ('apollo', 'ROLE_user');
