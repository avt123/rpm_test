id -u rpmtest &>/dev/null || useradd rpmtest

if [ -f /etc/init.d/rpmtest ];
then
   service rpmtest stop
fi
