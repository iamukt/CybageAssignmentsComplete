#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.8.1
 Author:         myName

 Script Function:
	Template AutoIt script.

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here

AutoItSetOption("Authentication Required","2")

WinWait($CmdLine[1])
WinActivate($CmdLine[1])
Send ($CmdLine[2])
Send ("{TAB}")
Send ($CmdLine[3])
Send ("{TAB}")
Send ("{ENTER}")