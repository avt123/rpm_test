# Do not stop the service in case of upgrade
if [ "$1" = "0" ]; then
    service rpmtest stop
fi