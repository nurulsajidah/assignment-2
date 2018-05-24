#include<stdio.h>

#include<netinet/in.h>

#include<sys/types.h>

#include<sys/socket.h>

#include<netdb.h>

#include<string.h>

#include<stdlib.h>

#include<time.h>

#include<stdio.h>

#define MAX 80

#define PORT 7777

#define SA struct sockaddr

int main(void)

{
{
time_t mytime = time(NULL);

char * time_str = ctime(&mytime);

time_str[strlen(time_str)-1] = '\0';

printf("Current Time : %s\n", time_str);

return 0;
}

int sockfd,connfd;

struct sockaddr_in servaddr,cli;

sockfd=socket(AF_INET,SOCK_STREAM,0);

if(sockfd==-1)

{

printf("socket creation failed...\n");

exit(0);

}

else

printf("Socket successfully created..\n");

bzero(&servaddr,sizeof(servaddr));

servaddr.sin_family=AF_INET;

servaddr.sin_addr.s_addr=inet_addr("192.168.135.137");

servaddr.sin_port=htons(PORT);

if(connect(sockfd,(SA *)&servaddr,sizeof(servaddr))!=0)

{

printf("connection with the server failed...\n");

exit(0);

}

else

printf("connected to the server..\n");

func(sockfd);

close(sockfd);

}




