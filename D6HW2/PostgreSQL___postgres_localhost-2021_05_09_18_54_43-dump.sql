--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id integer NOT NULL,
    user_no character(10) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Name: balance_sheets; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.balance_sheets (
    id integer,
    user_id integer NOT NULL,
    date date NOT NULL,
    safe_word character varying(100) NOT NULL,
    email_verified boolean NOT NULL
)
INHERITS (public.users);


ALTER TABLE public.balance_sheets OWNER TO postgres;

--
-- Name: employer_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employer_user (
    user_id integer NOT NULL,
    company_name character varying(100) NOT NULL,
    website character varying(100) NOT NULL,
    email character varying(48) NOT NULL,
    phone_number character varying(15) NOT NULL,
    password character varying NOT NULL,
    admin_verify boolean NOT NULL,
    verified_by character varying(15) NOT NULL,
    CONSTRAINT proper_email CHECK (((email)::text ~* '^[A-Za-z0-9._%-]+@'::text))
)
INHERITS (public.users);


ALTER TABLE public.employer_user OWNER TO postgres;

--
-- Name: seeker_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.seeker_user (
    user_id integer NOT NULL,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    date_of_birth date NOT NULL,
    email character varying(48) NOT NULL,
    national_id character varying(15) NOT NULL,
    password character varying NOT NULL,
    description text NOT NULL
)
INHERITS (public.users);


ALTER TABLE public.seeker_user OWNER TO postgres;

--
-- Name: staff_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.staff_user (
    user_id integer NOT NULL,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    email character varying(48) NOT NULL,
    national_id character varying(15) NOT NULL,
    password character varying NOT NULL,
    permission character varying NOT NULL
)
INHERITS (public.users);


ALTER TABLE public.staff_user OWNER TO postgres;

--
-- Data for Name: balance_sheets; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.balance_sheets (id, user_no, user_id, date, safe_word, email_verified) FROM stdin;
\.


--
-- Data for Name: employer_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employer_user (id, user_no, user_id, company_name, website, email, phone_number, password, admin_verify, verified_by) FROM stdin;
\.


--
-- Data for Name: seeker_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.seeker_user (id, user_no, user_id, first_name, last_name, date_of_birth, email, national_id, password, description) FROM stdin;
\.


--
-- Data for Name: staff_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.staff_user (id, user_no, user_id, first_name, last_name, email, national_id, password, permission) FROM stdin;
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (id, user_no) FROM stdin;
\.


--
-- Name: balance_sheets balance_sheets_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.balance_sheets
    ADD CONSTRAINT balance_sheets_pkey PRIMARY KEY (id);


--
-- Name: employer_user employer_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employer_user
    ADD CONSTRAINT employer_user_pkey PRIMARY KEY (user_id);


--
-- Name: seeker_user seeker_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.seeker_user
    ADD CONSTRAINT seeker_user_pkey PRIMARY KEY (user_id);


--
-- Name: staff_user staff_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.staff_user
    ADD CONSTRAINT staff_user_pkey PRIMARY KEY (user_id);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

