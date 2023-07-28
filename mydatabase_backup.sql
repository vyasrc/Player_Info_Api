--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3
-- Dumped by pg_dump version 15.3

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
-- Name: player; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.player (
    id integer NOT NULL,
    status boolean,
    updated timestamp with time zone,
    number character varying
);


ALTER TABLE public.player OWNER TO postgres;

--
-- Data for Name: player; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.player (id, status, updated, number) FROM stdin;
23	f	2023-07-27 19:47:18.551195-04	123-456-8899
34	f	2023-07-27 19:51:30.071679-04	555-426-8139
45	t	2023-07-27 20:09:40.212878-04	245-556-8130
\.


--
-- Name: player Player_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.player
    ADD CONSTRAINT "Player_pkey" PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

