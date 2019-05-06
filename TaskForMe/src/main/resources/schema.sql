
CREATE TABLE IF NOT EXISTS public.t_user
(
    t_user_id SERIAL,
    first_name character varying,
    last_name character varying,
    email character varying,
    user_name character varying,
    password character varying,
    contact_no TEXT,
    is_active boolean default true,
	created_on timestamp with time zone,
	updated_on timestamp with time zone,
    CONSTRAINT t_user_pkey PRIMARY KEY (t_user_id)
);


INSERT INTO t_user(t_user_id, first_name, last_name, email, user_name, password,  contact_no, is_active, created_on, updated_on)
VALUES (1, 'Luke', 'Skywalker', 'luke@company.com', 'luke', 'Pass@123','+91-1212222221', 'Y', current_timestamp, current_timestamp),
(2, 'Anakin', 'Skywalker', 'anakin@company.com', 'anakin', 'Pass@123','+91-121444543', 'Y', current_timestamp, current_timestamp);