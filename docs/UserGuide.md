---
layout: page
title: FinBook User Guide
---

# Table of Contents

1. [Introduction](#1-introduction)   
   1.1. [What is FinBook?](#11-what-is-finbook)
2. [How to use this User Guide?](#2-how-to-use-this-user-guide)   
   2.1. [Icons and symbols](#21-icons-and-symbols)   
   2.2. [User Interface (UI) of FinBook](#22-user-interface-ui-of-finbook)   
   2.3. [Command format](#23-command-format)
3. [Quick Start](#3-quick-start)
4. [Features](#4-features)   
   4.1. [Managing a client](#41-managing-a-client)      
   &emsp; 4.1.1. [Adding a client: `add`](#411-adding-a-client-add)   
   &emsp; 4.1.2. [Editing a client: `edit`](#412-editing-a-client--edit)   
   &emsp; 4.1.3. [Deleting a client: `delete`](#413-deleting-a-client--delete)   
   &emsp; 4.1.4. [Listing all clients: `list`](#414-listing-all-clients--list)   
   &emsp; 4.1.5. [Finding a client: `find`](#415-finding-a-client--find)   
   &emsp; 4.1.6. [Viewing Portfolio of a specific client: `view`](#416-viewing-portfolio-of-a-specific-client-view)   
   4.2. [Data privacy](#42-data-privacy)   
   &emsp; 4.2.1. [Locking the application: `lock`](#421-locking-the-application--lock)   
   &emsp; 4.2.2. [Setting or updating the password: `password`](#422-setting-or-updating-the-password--password)   
   4.3. [General](#43-general)   
   &emsp; 4.3.1. [Saving the data](#431-saving-the-data)   
   &emsp; 4.3.2. [Editing the data file](#432-editing-the-data-file)   
   &emsp; 4.3.3. [Importing data: `import`](#433-importing-data--import)   
   &emsp; 4.3.4. [Exporting data: `export`](#434-exporting-data--export)   
   &emsp; 4.3.5. [Copying a client's data: `copy`](#435-copying-a-clients-data--copy)   
   &emsp; 4.3.6. [Changing Light/Dark mode](#436-changing-lightdark-mode)   
   &emsp; 4.3.7. [Exiting the application: `exit`](#437-exiting-the-application--exit)
5. [FAQ](#5-faq)
6. [Glossary](#6-glossary)
7. [Command Summary](#7-command-summary)

--------------------------------------------------------------------------------------------------------------------

# 1. Introduction

## 1.1. What is FinBook?

FinBook is a desktop app for Financial Assistant (FA) to manage their client details and ensure that your data is
secured. With FinBook, you can set a unique password, manage and view client's details, meetings and portfolio as well
as many
other features to make your daily workflow much more efficient!

FinBook is optimized for use via a Command Line Interface (CLI), which means most of our commands are done by typing.
If you can type fast, managing your clients will be a breeze with FinBook. Can't type fast? Don't worry! Our Graphical
User Interface (GUI) will help you slowly adjust to using our CLI.

So what are you waiting for? Start using FinBook today!

# 2. How to Use this User Guide?

1. To get familiar with this user guide you can continue
   reading [How to Use this User Guide](#how-to-use-this-user-guide)
2. If you are a new user, you can get started with [Quick Start](#quick-start) to familiarise yourself with FinBook.
3. If you are familiar with FinBook, you can refer to the [Features](#features) to see details of all available
   commands or refer at [Command Summary](#command-summary).

## 2.1. Icons and symbols

| Symbol               | Meaning                                                                                    |
|----------------------|--------------------------------------------------------------------------------------------|
| :information_source: | Additional information that may be useful to know when using FinBook                       |
| :exclamation:        | Important information or warnings that you should take note of when using FinBook          | 
| `command`            | The highlighted words indicate a command that can be typed into the Command Box of FinBook |

## 2.2. User Interface (UI) of FinBook

![Ui](images/Ui_annotated.png)

The UI consists of:

| Components      | Purpose                               |
|-----------------|---------------------------------------|
| Menu Bar        | Consists of File and Help             |
| Theme Button    | To toggle between Light/Dark mode     | 
| Command Box     | To enter commands to be executed      |
| Message Box     | Display results of executed command   |
| Clients Panel   | Displays clients of FinBook           |
| Portfolio View  | Displays portfolio of selected client |

## 2.3. Command format

Commands in FinBook are constructed using a command word. Most commands consist of a command word, prefixes
and parameters

For example,
![Annotated command](images/command_annotated.png)

1. **Command word**: Indicates what action you want FinBook to do. For this example, the command word `add` will add
   a client into FinBook
2. **Prefix**: To specify the field of data added. Each prefix always ends with a `/`. For this example, `n/` indicates
   the
   client's name, `p/` indicates the client's phone number, etc.
3. **Parameter**: Provides supplementary information to the command word or prefix. For this example, `John Doe` is the
   parameter for `NAME`

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* If a parameter is expected only once in the command but you specified it multiple times, only the last occurrence of
  the parameter will be taken.<br>
  e.g. if you specify `p/12341234 p/56785678`, only `p/56785678` will be taken.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `delete all`)
  will be
  ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

</div>

---

# 3. Quick start

1. Ensure you have Java `11` or above installed in your Computer.

1. Download the latest `finbook.jar` from [here](https://github.com/AY2223S1-CS2103T-F11-3/tp/releases).

1. Copy the file to the folder you want to use as the home folder for your FinBook.

1. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds. Note how the app
   contains some sample data.<br>
   ![Ui](images/Ui_dark.png)

1. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will
   open the help window.<br>
   Some example commands you can try:

    * **`list`** : Lists all contacts.

    * **`add`**`n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01` : Adds a contact
      named `John Doe` to the FinBook.

    * **`delete`**` 3` : Deletes the 3rd contact shown in the current list.

    * **`clear`** : Deletes all contacts.

    * **`exit`** : Exits the app.

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

# 4. Features

## 4.1. Managing a client

### 4.1.1. Adding a client: `add`

Adds a client to the FinBook.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS i/MONTHLY_INCOME m/UPCOMING_MEETING_DATES

        t/TAGS r/RISK_LEVEL pl/CURRENT_PLANS note/ADDITIONAL_NOTES​`

Examples:

* `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01 i/$100000 m/12-Jan-2022 t/VIPClient
  r/high pl/Prudential Health note/Client is currently having COVID`
* `add n/Betsy Crowe t/friend e/betsycrowe@example.com a/ABC street p/1234567 i/$10 m/23-Feb-2022 r/low
  pl/NTUC Income Plan`

---

### 4.1.2. Editing a client : `edit`

Edits an existing client in the FinBook.

Format: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [i/MONTHLY_INCOME] [m/UPCOMING_MEETING_DATES]

        [t/TAGS] [r/RISK_LEVEL] [pl/CURRENT_PLANS] [note/ADDITIONAL_NOTES]​`

* Edits the client at the specified `INDEX`. The index refers to the index number shown in the displayed client list.
  The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.

Examples:

* `edit 1 p/91234567 e/johndoe@example.com` Edits the phone number and email address of the 1st client to be `91234567`
  and `johndoe@example.com` respectively.
* `edit 2 n/Betsy Crower` Edits the name of the 2nd client to be `Betsy Crower`.

---

### 4.1.3. Deleting a client : `delete`

Four formats of deleting a client.

1. `delete INDEX`
2. `delete INDEX1, INDEX2, …`
3. `delete STARTINDEX - ENDINDEX`
4. `delete all`

* The index refers to the index number shown in the displayed client list.
* The index **must be a positive integer** 1, 2, 3, …​

#### Deleting a single client

Deletes the specified client from the FinBook.

Format: `delete INDEX`

* Deletes the client at the specified `INDEX`.

Examples:

* `list` followed by `delete 2` deletes the 2nd client in the FinBook.
* `find Betsy` followed by `delete 1` deletes the 1st client in the results of the `find` command.

#### Deleting multiple clients

Deletes multiple specified clients from the FinBook.

Format: `delete INDEX1, INDEX2, …`

* Deletes the client at the specified `INDEX1`, `INDEX2`, and so on.
* Value of `INDEX1`, `INDEX2`, … cannot contain any repeated values.

Examples:

* `list` followed by `delete 1, 2, 5` deletes the 1st, 2nd and 5th client in the FinBook.

Deletes a range of clients from the FinBook.

Format: `delete STARTINDEDX - ENDINDEX`

* Deletes the client from `STARTINDEX` to `ENDINDEX` inclusive.
* Value of`STARTINDEX` must be smaller than `ENDINDEX`.

Examples:

* `list` followed by `delete 1-3` deletes the 1st, 2nd and 3rd client in the FinBook.

Deletes all clients from the FinBook.

Format: `delete all`

* Deletes all clients in FinBook.

Examples:

* `list` followed by `delete all` deletes the all clients in the FinBook.

---

### 4.1.4. Listing all clients : `list`

Shows a list of all clients in the FinBook.

Format: `list`

---

### 4.1.5. Finding a client : `find`

(toc)

---

### 4.1.6. Viewing Portfolio of a specific client: `view`

View a specific's client portfolio

Format: `view INDEX`

* Displays the portfolio of client at index `INDEX` on the Portfolio section
* Portfolio includes risk level and current plans purchased by the client.

Examples:

* `view 1` displays the risk level and current plans purchased by the 1st client of the Financial book data.
* `view 2` displays the risk level and current plans purchased by the 2nd client of the Financial book data.

---

## 4.2. Data privacy

### 4.2.1. Locking the application : `lock`

Locks the application

Format: `lock`

<div markdown="block" class="alert alert-info">

**:information_source: If a password has not been set, leave the password field empty to unlock the application**
</div>

---

### 4.2.2. Setting or updating the password : `password`

Sets or updates the FinBook password

Format: `password [old/OLDPASSWORD] new/NEWPASSWORD`

* Sets or updates the password to the specified new password
* No need to specify old password if setting the password for the first time
* When updating the password, the specified old password must match the current password

Examples:

* `password new/foobar` sets the password to `foobar`, given that a password has not yet been set
* `password old/foobar new/barfoo` updates the password to `barfoo`, given that the current password is `foobar`.

<div markdown="block" class="alert alert-info">

**:information_source: It is recommended to take note of the warnings and follow the suggestions, if there are any**
</div>

---

## 4.3. General

### 4.3.1. Saving the data

Financial book data are saved in the hard disk automatically after any command that changes the data. There is no need
to
save manually.

---

### 4.3.2. Editing the data file

Financial book data are saved as a JSON file `[JAR file location]/data/addressbook.json`. Advanced users are welcome to
update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data file makes its format invalid, FinBook will discard all data and start with an empty data file at the next run.
</div>

---

### 4.3.3. Importing data : `import`

Imports data from a `JSON` or `CSV` file

* `JSON` files must be saved by the latest version of FinBook
* `CSV` files must be formatted correctly as follows:
    * The first line of the file must contain these headers in any order:
        * `name`
        * `phone`
        * `email`
        * `address`
        * `income`
        * `meeting date`
        * `tags`
        * `risk`
        * `plans`
        * The data in each corresponding column must be valid
            * `tags` must be separated by commas `,` without spaces (e.g. `colleagues,friends,neighbours`)
            * `plans` must be separated by commas `,` without spaces (
              e.g. `prudential income,NTUC income,prudential health`)

Format: `import PATH`

* Imports data from the file at the specified `PATH`
* `PATH` can be a relative or full path
* `PATH` must end in `.json` or `.csv`

Examples:

* `import ./data.json` imports data from the file `data.json` which is located in the same directory as the FinBook
  executable
* `import ../data.csv` imports data from the file `data.csv` which is located one level outside the directory of the
  FinBook executable

---

### 4.3.4. Exporting data : `export`

Exports data to a `CSV` file

Format: `export PATH`

* Exports data to the file at the specified `PATH`
* `PATH` can be a relative or full path
* `PATH` must end in `.csv`

Examples:

* `export ./data.csv` exports data to the file `data.csv` which is located in the same directory as the FinBook
  executable
* `export ../data.csv` exports data to the file `data.csv` which is located one level outside the directory of the
  FinBook executable

---

### 4.3.5. Copying a client's data : `copy`

Copies the data of an existing client in the FinBook into your Computer's clipboard.

Format: `copy INDEX`

Example: `copy 1` with the sample data will result a copied output of:

```
Name: Alex Yeoh
Phone: 87438807
Email: alexyeoh@example.com
Address: Blk 30 Geylang Street 29, #06-40
Income: $1000
Meeting date: 12 Nov 2022
Tags: friends
```

* Press `Ctrl-V` to paste the copied text.

---

### 4.3.6. Changing Light/Dark mode

Toggle the theme of FinBook by clicking on the `sun` or `moon` icon on the top right of the application.

* If icon is a `moon` FinBook is in Dark mode.
  ![Dark mode](images/Ui_dark.png)
* If icon is a `sun` FinBook is in Light mode.
* ![Light mode](images/Ui_light.png)

<div markdown="block" class="alert alert-info">

**:information_source: Your mode preference will be automatically saved**
</div>

---

### 4.3.7. Exiting the application : `exit`

Exits the application.

Format: `exit`

--------------------------------------------------------------------------------------------------------------------

# 5. FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains
the data of your previous FinBook home folder. Alternatively, you may use the `export` and `import` commands.

--------------------------------------------------------------------------------------------------------------------

# 6. Glossary

| Term                         | Meaning                                                                                            |
|------------------------------|----------------------------------------------------------------------------------------------------|
| Mainstream OS                | Common computer operating systems, Windows, Linux, Unix, OS-X.                                     |
| Command-line Interface (CLI) | A application that users interact with by typing text.                                             |
| Command                      | A sequence specified text typed by the user to perform an action.                                  |
| Prefix                       | A tag to specify the field of data added. Each prefix always ends with a `/`.                      |                                                                                                  |
| Parameter                    | Users input to a command.                                                                          |
| Field                        | The data type of client. For example, Name and Income are fields of a client.                      |
| CSV                          | A comma-separated values (CSV) file is a delimited text file that uses a comma to separate values. |

---

# 7. Command summary

| Action               | Format, Examples                                                                                                                                                                                                                                                                                                                                      |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add**              | `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS i/MONTHLY_INCOME m/UPCOMING_MEETING_DATES t/TAGS r/RISK_LEVEL pl/CURRENT_PLANS note/ADDITIONAL_NOTES​` <br> e.g., `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01 i/$100000 m/12-Jan-2022 t/VIPClient r/high pl/Prudential Health note/Client is currently having COVID` |
| **Delete**           | `delete INDEX` `delete INDEX1, INDEX2, …` `delete STARTINDEX - ENDINDEX` `delete all` <br> e.g., `delete 3` `delete 1, 2, 5` `delete 2-5`                                                                                                                                                                                                             |
| **Copy**             | `copy INDEX`   <br> e.g., `copy 1`                                                                                                                                                                                                                                                                                                                    |
| **Edit**             | `edit INDEX [n/NAME] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS] [t/TAG] [r/RISK_LEVEL] [pl/CURRENT_PLANS] [note/ADDITIONAL_NOTES]​`<br> e.g.,`edit 2 n/James Lee e/jameslee@example.com`                                                                                                                                                                  |
| **List**             | `list`                                                                                                                                                                                                                                                                                                                                                |
| **Find**             | (toc)                                                                                                                                                                                                                                                                                                                                                 | 
| **View Portfolio**   | `view INDEX` <br> e.g., `view 1`                                                                                                                                                                                                                                                                                                                      |
| **Lock application** | `lock`                                                                                                                                                                                                                                                                                                                                                |
| **Password**         | `password [old/OLDPASSWORD] new/NEWPASSWORD`<br> e.g.,`password old/foobar new/barfoo`                                                                                                                                                                                                                                                                |
| **Copy**             | `copy INDEX`   <br> e.g., `copy 1`                                                                                                                                                                                                                                                                                                                    |
| **Import**           | `import PATH`<br> e.g., `import ./data.json`                                                                                                                                                                                                                                                                                                          |
| **Export**           | `export PATH`<br> e.g., `export ./data.csv`                                                                                                                                                                                                                                                                                                           |
| **Exit application** | `exit`                                                                                                                                                                                                                                                                                                                                                |
