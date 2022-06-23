;Wait for 10 seconds top get upload popup
Local $winId= WinWait("[CLASS:#32770]","",10)

;set focus on file name text field of upload button
ControlFocus($winId,"","Edit1")
;wait for 2 seconds
Sleep(2000)
; set file path
ControlSetText($winId,"","Edit1","F:\Acceleration\Jan_9_Selenium\AutoitFiles\"&$CmdLine[1])

ControlClick ($winId,"","Button1")