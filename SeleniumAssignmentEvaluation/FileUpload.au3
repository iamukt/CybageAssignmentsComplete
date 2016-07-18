#cs ----------------------------------------------------------------------------

 AutoIt Version: 3.3.8.1
 Author:         myName

 Script Function:
	Template AutoIt script.

#ce ----------------------------------------------------------------------------

; Script Start - Add your code below here

;;AutoItSetOption("File Upload","2")
;;WinWait($CmdLine[1])
;$title -  Accessing a Variable
;;WinActivate($CmdLine[1])
;WinWaitActive – Pauses execution until the window is active.
;If() Else EndIf
;StringCompare – Comparing a String

;;ControlSetText($CmdLine[2])
;– Sets text in control
;MsgBox  (flag : 262144 )- Displays a simple message box with optional timeout.
;;ControlClick(Button);
;-  Sends a mouse click command to a given control
;MsgBox(262144, 'Debug line ~' & @ScriptLineNumber, 'Selection:' & @CRLF & ' 
WinWaitActive($CmdLine[1])
;ControlSetText($CmdLine[1],"","Edit1",$CmdLine[2])
ControlSetText($CmdLine[1],"","ToolbarWindow323",$CmdLine[2])
ControlSetText($CmdLine[1],"","Edit1",$CmdLine[3])
ControlClick($CmdLine[1],"","Button1")
;Send($CmdLine[3])
;Send("{ENTER}")

