using UnityEngine;
using UnityEngine.InputSystem;

public class Player : MonoBehaviour
{
   public Rigidbody2D rb;
    public PlayerInput playerInput;
    public float speed;

    public Vector2 moveInput;

    public Animator animator; //Added later.


    void FixedUpdate()
    {
        float targetSpeed = moveInput.x * speed;
        rb.linearVelocity = new Vector2 (targetSpeed, rb.linearVelocity.y);
        //animator.SetBool("OntheMove", ); //Added Later
    }


    public void OnMove(InputValue value)
    {
        moveInput = value.Get<Vector2>();
    }
}