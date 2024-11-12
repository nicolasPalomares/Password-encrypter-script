$continueRunning = $true

while ($continueRunning) {
	
    java -cp ".;com\example\util\spring-security-crypto-6.3.4.jar;com\example\util\commons-logging-1.3.4.jar" com.example.util.EncryptPassword
    
    $userChoice = Read-Host "Exit program? (y/n)"
    
    if ($userChoice -eq 'y') {
        $continueRunning = $false
    }
}