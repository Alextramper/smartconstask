package ru.smartconstask.beans;


import javax.persistence.*;


public class Client {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * Логин
     */
    private String login;
    /**
     * Пароль
     */
    private String psswd;
    /**
     * Имя
     */
    private String firstname;

    /**
     * Фамилия
     */
    private String surname;

    /**
     * Конструктор, принимающий все параметры
     */
    public Client(int id, String login, String psswd, String firstname, String surname) {
        this.id = id;
        this.login = login;
        this.psswd = psswd;
        this.firstname = firstname;
        this.surname = surname;
    }

    /**
     * Конструктор с отдельными параметрами
     * @param id идентификатор
     * @param firstname имя
     * @param surname фамилия
     */
    public Client(int id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
    }

    /**
     * Конструктор по-умолчанию
     */
    public Client() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String secondname) {
        this.surname = secondname;
    }

    public String getFullName(String surname, String firstname) {
        return String.join(" ", surname, firstname);
    }

    @Override
    public String toString() {
        return String.join(";", String.valueOf(id), login, psswd, firstname, surname) ;
    }
}
